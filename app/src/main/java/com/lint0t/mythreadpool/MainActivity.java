package com.lint0t.mythreadpool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mbtn,mbtn2;
    private Button mbtn3;
    private Button mbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtn = findViewById(R.id.btn);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyThreadPool myThreadPool = new MyThreadPool();
                myThreadPool.setMode(MyThreadPool.USE_CACHEDTHREADPOOL).setTaskNumber(10)
                        .setRunnable(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("run: ",Thread.currentThread().getName());
                    }
                }).go();
            }
        });

        mbtn2 = findViewById(R.id.btn2);
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyThreadPool myThreadPool = new MyThreadPool();
                myThreadPool.setMode(MyThreadPool.USE_FIXEDTHREADPOOL).setTaskNumber(10).setMaxThread(3).setRunnable(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("run: ",Thread.currentThread().getName());
                    }
                }).go();
            }
        });

        mbtn3 = findViewById(R.id.btn3);
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyThreadPool myThreadPool = new MyThreadPool();
                myThreadPool.setMode(MyThreadPool.USE_SINGLETHREADPOOL).setTaskNumber(10).setRunnable(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("run: ",Thread.currentThread().getName());
                    }
                }).go();
            }
        });

        mbtn4 = findViewById(R.id.btn4);
        mbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyThreadPool myThreadPool = new MyThreadPool();
                myThreadPool.setMode(MyThreadPool.USE_SCHEDULEEXECUTORSERVICE).setDelay(3).setRunnable(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("run: ",Thread.currentThread().getName());
                    }
                }).go();
            }
        });
    }
}

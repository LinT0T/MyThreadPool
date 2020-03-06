# MyThreadPool
A threadpool tool.
## How to use:
- This tool package 4 threadpools,including cachedThreadPool,fixedThreadPool,singleThreadPool and scheduleThreadPool(single).

- You can choose modes by MyThreadPool. ,there're 4 modes.

- If you don't set,taskNumber is 1,maxThread is 1,mode is 1,delay is 0,period is 0 and TimeUnit is second.
---
### cachedThreadPool:
You can use setMode(),setRunnable(),setTaskNumber() and go();
  
  for example:
```
MyThreadPool myThreadPool = new MyThreadPool();
// set sth with chained invocation.
myThreadPool.setMode(MyThreadPool.USE_CACHEDTHREADPOOL).setTaskNumber(10).setRunnable(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("run: ",Thread.currentThread().getName());
                    }
                }).go();
```
### fixedThreadPool:
You can use setMode(),setRunnable(),setTaskNumber(),setMaxThread() and go();
  
for example:
```
MyThreadPool myThreadPool = new MyThreadPool();
// set sth with chained invocation.
myThreadPool.setMode(MyThreadPool.USE_FIXEDTHREADPOOL).setTaskNumber(10).setMaxThread(3).setRunnable(new Runnable() {
  @Override
  public void run()
  {
    Log.d("run: ",Thread.currentThread().getName());
  }
  }).go();
```
---
### singleThreadPool:
You can use setMode(),setRunnable(),setTaskNumber() and go();
  
  for example:
```
MyThreadPool myThreadPool = new MyThreadPool();
// set sth with chained invocation.
myThreadPool.setMode(MyThreadPool.USE_SINGLETHREADPOOL).setTaskNumber(10).setRunnable(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("run: ",Thread.currentThread().getName());
                    }
                }).go();
```
---
### scheduleThreadPool:
You can use setMode(),setRunnable(),setDelay(),setTimeUnit() and go();
  
  for example:
```
MyThreadPool myThreadPool = new MyThreadPool();
// set sth with chained invocation.
 myThreadPool.setMode(MyThreadPool.USE_SCHEDULEEXECUTORSERVICE).setDelay(3).setTimeUnit(TimeUnit.SECONDS).setRunnable(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("run: ",Thread.currentThread().getName());
                    }
                }).go();
```
---
# END

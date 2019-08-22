package com.linfix.concurrency.first.chapter05;

public class ThreadService {

    private Thread executeThread;
    private boolean finised = false;

    public void execute(Runnable runnable){
        executeThread = new Thread(){
            @Override
            public void run() {
               Thread runner = new Thread(runnable);
               runner.setDaemon(true);
               runner.start();
                try {
                    runner.join();
                    finised = true;
                } catch (InterruptedException e) {
                }
            }
        };
        executeThread.start();
    }

    public void shutDown(long mills){
        long currentTime = System.currentTimeMillis();
        while (!finised){
            if(System.currentTimeMillis() - currentTime>=mills){
                System.out.println("任务执行超时");
                executeThread.interrupt();
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("执行线程被打断");
                break;
            }
            finised = false;
        }
    }

}

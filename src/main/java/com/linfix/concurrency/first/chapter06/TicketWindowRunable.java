package com.linfix.concurrency.first.chapter06;


public class TicketWindowRunable implements Runnable{

    private static final int MAX = 500;
    private static int index = 1;
    private final Object MONITOR = new Object();
    @Override
    public void run() {
        synchronized (MONITOR){
            while (index <= MAX){
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("窗口"+Thread.currentThread().getName()+"票号为："+(index++));
            }
        }

    }
}

package com.linfix.concurrency.first.chapter06;

public class SynchronizedTest {
    private final static  Object LOCK = new Object();

    public static void main(String[] args) {
        Runnable runnable = ()->{
            synchronized (LOCK){
                try {
                    Thread.sleep(20_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread1.start();
        thread2.start();
    }
}

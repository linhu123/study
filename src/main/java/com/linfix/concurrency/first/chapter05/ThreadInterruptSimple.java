package com.linfix.concurrency.first.chapter05;

public class ThreadInterruptSimple {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            while (true){
                System.out.println(Thread.currentThread().isInterrupted());
            }
        });
        thread.start();
        Thread.sleep(3_000);
        thread.interrupt();
    }
}

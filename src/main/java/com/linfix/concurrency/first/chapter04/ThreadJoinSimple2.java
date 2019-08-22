package com.linfix.concurrency.first.chapter04;
/**
 * noly function is join()
 */
public class ThreadJoinSimple2
{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            try {
                Thread.currentThread().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.join();
        System.out.println("main is finished");
    }
}

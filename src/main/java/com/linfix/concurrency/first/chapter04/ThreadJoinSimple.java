package com.linfix.concurrency.first.chapter04;

import java.util.stream.IntStream;

/**
 * introduce the join() for thread
 */
public class ThreadJoinSimple
{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));
        });
        thread.start();
        thread.join();
        IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));


    }
}

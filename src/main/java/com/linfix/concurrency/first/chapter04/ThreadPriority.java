package com.linfix.concurrency.first.chapter04;

import java.util.Optional;

/**
 * introduce the Priority for Thread
 */
public class ThreadPriority {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0;i<=1000;i++){
                Optional.of(Thread.currentThread().getName()+"index"+i).ifPresent(System.out::println);
            }
        });
    Thread thread1 = new Thread(()->{
        for (int i = 0;i<=1000;i++){
            Optional.of(Thread.currentThread().getName()+"index"+i).ifPresent(System.out::println);
        }
    });
    Thread thread2 = new Thread(()->{
        for (int i = 0;i<=1000;i++){
            Optional.of(Thread.currentThread().getName()+"index"+i).ifPresent(System.out::println);
        }
    });
    thread.setPriority(Thread.MAX_PRIORITY);
    thread.start();
    thread1.setPriority(Thread.NORM_PRIORITY);
    thread1.start();
    thread.setPriority(Thread.MIN_PRIORITY);
    thread2.start();

    }
}

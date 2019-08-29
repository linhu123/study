package com.linfix.concurrency.eBook.chapter05;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * @program: study
 * @description: 事件客户端
 * @author: linfix
 * @create: 2019-08-29 09:59
 **/
public class EventClient {
    public static void main(String[] args) {
        final EventQueue eventQueue = new EventQueue();
        new Thread(()->{
            for (;;){
                eventQueue.offer(new EventQueue.Event());
            }
        },"Producer").start();

        new Thread(()->{
            for (;;){
                eventQueue.take();
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Consumer").start();
    }
}

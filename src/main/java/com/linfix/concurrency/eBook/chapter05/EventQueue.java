package com.linfix.concurrency.eBook.chapter05;

import java.util.LinkedList;

/**
 * @program: study
 * @description: 事件队列
 * @author: linfix
 * @create: 2019-08-29 09:39
 **/
public class EventQueue
{
    private final int max;

    static class Event{

    }

    private final LinkedList<Event> eventQueue = new LinkedList<>();
    private final static int DEFAULT_MAX_EVENT = 10;

    public EventQueue() {
        this(DEFAULT_MAX_EVENT);
    }

    public EventQueue(int max) {
        this.max = max;
    }
    public void offer(Event event){
        synchronized (eventQueue){
            if(eventQueue.size()>max){
                try {
                    console("this eventQueue is fulled !!!");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            console("the new event is submitted !!!");
            eventQueue.add(event);
            eventQueue.notify();
        }
    }

    public Event take(){
        synchronized (eventQueue){
            if(eventQueue.isEmpty()){
                try {
                    console("this eventQueeu is empty!!!");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Event event = eventQueue.removeFirst();
            this.eventQueue.notify();
            console("this"+event+"is handled!!!");
            return event;
        }
    }

    public void console(String message){
        System.out.printf("%S:%S\n",Thread.currentThread().getName(),message);
    }
}

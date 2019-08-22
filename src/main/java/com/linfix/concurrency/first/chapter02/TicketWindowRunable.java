package com.linfix.concurrency.first.chapter02;


public class TicketWindowRunable implements Runnable{

    private String name;
    private static final int MAX = 50;
    private static int index = 1;
    @Override
    public void run() {
        while (index <= MAX){
            System.out.println("窗口"+this.name+"票号为："+(index++));
        }
    }
}

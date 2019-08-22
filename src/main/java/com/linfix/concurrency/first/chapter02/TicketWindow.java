package com.linfix.concurrency.first.chapter02;

public class TicketWindow extends Thread {
    private String name;
    private final static int MAX = 50;
    private static int index = 0;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index <= 50){
            System.out.println("窗口"+this.name+"售出票为"+(++index));
        }
    }
}

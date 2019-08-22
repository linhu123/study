package com.linfix.concurrency.first.chapter02;

public class Bank {

    public static void main(String[] args) {
        TicketWindow t1  = new TicketWindow("1");
        t1.start();

        TicketWindow t2  = new TicketWindow("2");
        t2.start();

        TicketWindow t3  = new TicketWindow("3");
        t3.start();
    }
}

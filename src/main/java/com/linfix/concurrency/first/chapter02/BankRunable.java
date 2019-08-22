package com.linfix.concurrency.first.chapter02;

public class BankRunable {

    public static void main(String[] args) {
        final TicketWindowRunable t = new TicketWindowRunable();
        Thread t1 = new Thread(t,"窗口一");
        t1.start();
        Thread t2 = new Thread(t,"窗口二");
        t2.start();
        Thread t3 = new Thread(t,"窗口三");
        t3.start();

    }
}

package com.linfix.concurrency.first.chapter06;

public class BankRunable {

    public static void main(String[] args) {
        final TicketWindowRunable t = new TicketWindowRunable();
        Thread t1 = new Thread(t,"窗口一");
        Thread t2 = new Thread(t,"窗口二");
        Thread t3 = new Thread(t,"窗口三");
        t1.start();
        t2.start();
        t3.start();

    }
}

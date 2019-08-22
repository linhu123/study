package com.linfix.concurrency.first.chapter04;

public class DemoThread {

    public static void main(String[] args) {
        Thread t = new Thread(){//new 状态
            @Override
            public void run(){
                System.out.println("begin the thread--"+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end the thread--"+Thread.currentThread().getName());
            }
        };
        t.setDaemon(true);//设置t为守护进程
        t.start();//runable 状态
        System.out.println(Thread.currentThread().getName());
    }
}

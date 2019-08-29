package com.linfix.concurrency.eBook.chapter05;

/**
 * @program: study
 * @description: 测试是否为同一个moniter
 * @author: linfix
 * @create: 2019-08-29 11:27
 **/
public class Test02 {
    private final Object MUTEX = new Object();
    private synchronized void testWait(){
        try {
            MUTEX.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private synchronized void testNotify(){
        MUTEX.notify();
    }
    private void testWait01(){
        synchronized (MUTEX){
            try {
                MUTEX.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void testNotify1(){
        synchronized (MUTEX){
            MUTEX.notify();
        }
    }
    public static void main(String[] args) {
//        new Test02().testWait();
//        new Test02().testNotify();
//        new Test02().testWait01();
        new Test02().testNotify1();
    }




}

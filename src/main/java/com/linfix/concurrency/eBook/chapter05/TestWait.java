package com.linfix.concurrency.eBook.chapter05;

/**
 * @program: study
 * @description: 测试java wait()方法
 * @author: linfix
 * @create: 2019-08-29 10:40
 **/
public class TestWait
{
    public static void main(String[] args) {
        new TestWait().testWait();


    }
    public void testWait(){
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void testNotify(){
        this.notify();

    }

}

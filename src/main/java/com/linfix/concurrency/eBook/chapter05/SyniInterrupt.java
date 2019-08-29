package com.linfix.concurrency.eBook.chapter05;

import com.linfix.concurrency.first.chapter06.SynchronizedTest;

import java.util.concurrent.TimeUnit;

/**
 * @program: study
 * @description: 测试sync 阻塞是否可以被中断
 * @author: linfix
 * @create: 2019-08-29 13:22
 **/
public class SyniInterrupt {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedDefect defect = new SynchronizedDefect();
        Thread thread1 = new Thread(defect::syncMethod);
        thread1.start();
        TimeUnit.SECONDS.sleep(2);
        Thread thread2 = new Thread(defect::syncMethod);
        thread2.start();
        TimeUnit.SECONDS.sleep(2);
        thread2.interrupt();
        System.out.println(thread2.isInterrupted());
        System.out.println(thread2.getState());
    }
}

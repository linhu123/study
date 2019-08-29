package com.linfix.concurrency.eBook.chapter05;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @program: study
 * @description: Sync
 * @author: linfix
 * @create: 2019-08-29 13:24
 **/
public class SynchronizedDefect {
    public synchronized void syncMethod(){
        try {
            TimeUnit.HOURS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

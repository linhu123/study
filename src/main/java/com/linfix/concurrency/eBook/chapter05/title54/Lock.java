package com.linfix.concurrency.eBook.chapter05.title54;

import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * @program: study
 * @description: 显示锁接口
 * @author: linfix
 * @create: 2019-08-29 13:31
 **/
public interface Lock {
    void lock() throws InterruptedException;

    void lock(long mills) throws InterruptedException,TimeoutException;

    void unLoc();

    List<Thread> getBlockedThreads();

}

package com.linfix.concurrency.first.chapter04;

import javax.swing.text.html.Option;
import java.util.Optional;

public class DemoSimplyApi {
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            Optional.of("Hello").ifPresent(System.out::println);
            try {
                Thread.sleep(30_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1");
        thread.start();
        Optional.of(thread.getName()).ifPresent(System.out::println);
        Optional.of(thread.getId()).ifPresent(System.out::println);
        Optional.of(thread.getPriority()).ifPresent(System.out::println);
    }
}

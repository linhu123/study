package com.linfix.concurrency.first.chapter05;

public class ThreadCloseForce {
    public static void main(String[] args) {
        ThreadService service = new ThreadService();
        long start = System.currentTimeMillis();
        service.execute(()->{
            while (true){
//                System.out.println("load a big resource!!!!");
            }
        });
        service.shutDown(10000);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

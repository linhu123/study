package com.linfix.concurrency.first.chapter05;

public class ThreadCloseGraceful2 {
    private static class Worker extends Thread{
        @Override
        public void run() {
            while (true){
//                try {
//                    Thread.sleep(1_000);
//                    System.out.println("working ");
//                } catch (InterruptedException e) {
//                    break;
//                }
                if (currentThread().interrupted()){
                    break;
                }
                System.out.println("working ");
            }
        }

    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.interrupt();
    }
}

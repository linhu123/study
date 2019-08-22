package com.linfix.concurrency.first.chapter05;

public class ThreadCloseGraceful {
    private static class Worker extends Thread{
        private volatile boolean start = true;

        @Override
        public void run() {
            while (start){
                System.out.println(start);
            }
        }
        public void shutDown(){
            this.start = false;
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
        worker.shutDown();

    }
}

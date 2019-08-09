package com.linfix.winterbe.thread;

import java.util.concurrent.TimeUnit;

public class Thread02 {
	public static void main(String[] args) {
		Runnable runnable = ()->{
			try {
				String threadName = Thread.currentThread().getName();
				System.out.println("foo"+threadName);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("bar"+threadName);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		runnable.run();
		Thread thread = new Thread(runnable);
		thread.start();
	}
}

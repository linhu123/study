package com.linfix.winterbe.thread;

public class Thread01 {

	public static void main(String[] args) {
		Runnable runnable = ()-> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		};
		runnable.run();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("Done!!!");
	}
}

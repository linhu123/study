package com.linfix.winterbe.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Callable01 {
	
	public static void main(String[] args) {
		Callable<Integer> task = ()->{
			try {
				TimeUnit.SECONDS.sleep(60);
				return 123;
			} catch (InterruptedException e) {
				throw new IllegalStateException("task interrupted",e);
			}
		};
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer> future = executor.submit(task);
		System.out.println("future done? " + future.isDone());
		Integer result = -1;
		try {
			/*
			 * 	调用future.get()会阻塞当前进程，但是可以设置一个阻塞时间
			 */
//			result = future.get();
			try {
				result = future.get(1,TimeUnit.SECONDS);
			} catch (TimeoutException e) {
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("future done? " + future.isDone());
		System.out.print("result: " + result);
		
	}
}

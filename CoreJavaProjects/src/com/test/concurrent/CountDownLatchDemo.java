package com.test.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CountDownLatchImpl implements Runnable {
	private CountDownLatch latch;
	
	public CountDownLatchImpl(CountDownLatch latch) {
		this.latch = latch;
	}
	
	public void run() {
		
		System.out.println("Thread Started");
		try {
			Thread.sleep(1000);
			System.out.println("sleep");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
	}
}

public class CountDownLatchDemo {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(int i = 0; i<3; i++) {
			service.submit(new CountDownLatchImpl(latch));
		}
		
		try {
			latch.await();
			System.out.println("await");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed");
	}
}

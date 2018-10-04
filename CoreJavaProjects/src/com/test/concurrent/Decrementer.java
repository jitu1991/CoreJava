package com.test.concurrent;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable{

	CountDownLatch latch = null;
	
	public Decrementer(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		try {
			Thread.sleep(1000);
			latch.countDown();
			System.out.println("Sleep 1000");

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("Sleep 1000");

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("Sleep 1000");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}

package com.test.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3);
		
		Waiter waiter = new Waiter(latch);
		Decrementer dec = new Decrementer(latch);
		
		new Thread(waiter).start();
		new Thread(dec).start();
		
		Thread.sleep(4000);
		
	}

}

package com.test.concurrency;

import java.util.concurrent.TimeUnit;

public class Task11 implements Runnable {

	@Override
	public void run() {
		System.out.printf("Task: Begin.\n");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Task: End.\n");
	}
}

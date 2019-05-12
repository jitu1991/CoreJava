package com.test.concurrency;

import java.util.concurrent.TimeUnit;

public class Task14 implements Runnable {
	private long milliseconds;

	public Task14(long milliseconds) {
		this.milliseconds = milliseconds;
	}

	@Override
	public void run() {
		System.out.printf("%s: Begin\n", Thread.currentThread().getName());
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("%s: End\n", Thread.currentThread().getName());
	}
}

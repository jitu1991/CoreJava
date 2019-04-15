package com.test.concurrency;

import java.util.concurrent.TimeUnit;

public class Task2 implements Runnable {

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

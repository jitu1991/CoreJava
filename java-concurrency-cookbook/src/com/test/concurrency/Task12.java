package com.test.concurrency;

import java.util.concurrent.TimeUnit;

public class Task12 implements Runnable {

	private MyLock lock;
	private String name;

	public Task12(String name, MyLock lock) {
		this.lock = lock;
		this.name = name;
	}

	@Override
	public void run() {
		lock.lock();
		System.out.printf("Task: %s: Take the lock\n", name);
		try {
			TimeUnit.SECONDS.sleep(2);
			System.out.printf("Task: %s: Free the lock\n", name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}

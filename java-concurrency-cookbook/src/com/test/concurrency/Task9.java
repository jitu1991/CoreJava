package com.test.concurrency;

import java.util.Date;
import java.util.concurrent.DelayQueue;

public class Task9 implements Runnable {
	int id;
	private DelayQueue<Event1> queue;

	public Task9(int id, DelayQueue<Event1> queue) {
		this.id = id;
		this.queue = queue;
	}

	@Override
	public void run() {
		Date now = new Date();
		Date delay = new Date();
		delay.setTime(now.getTime() + (id * 1000));
		System.out.printf("Thread %s: %s\n", id, delay);
		for (int i = 0; i < 100; i++) {
			Event1 event = new Event1(delay);
			queue.add(event);
		}
	}
}

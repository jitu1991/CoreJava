package com.test.concurrent;

import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable {
	private static int capacity;
	private BlockingQueue<Integer> intqueue;

	public ProducerThread(BlockingQueue<Integer> queue, int cap) {
		this.capacity = cap;
		this.intqueue = queue;
	}

	public void run() {
		for (int i = 0; i < capacity - 1; i++) {
			try {
				intqueue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			intqueue.put(-1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
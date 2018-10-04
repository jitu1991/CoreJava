package com.test.concurrent;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread implements Runnable {
	private static int capacity;
	private BlockingQueue<Integer> intqueue;

	public ConsumerThread(BlockingQueue<Integer> queue, int cap) {
		this.capacity = cap;
		this.intqueue = queue;
	}

	public void run() {
		int num;
		for (int i = 0; i < capacity; i++) {
			try {
				num = intqueue.take();
				if (num == -1)
					break;
				System.out.println("The Square of " + num + " is " + num * num);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

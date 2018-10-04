package com.test.concurrent;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {

	private List queue = new LinkedList();
	private int limit = 10;

	public synchronized void enqueue(Object item) throws InterruptedException {

		while (this.queue.size() == this.limit) {
			wait();
		}
		if (this.queue.size() == 0) {
			notifyAll();
		}
		if (queue.isEmpty()) {
			queue.add(item);
		}
	}

	public synchronized Object dequeue() throws InterruptedException {
		while (this.queue.size() == 0) {
			wait();
		}
		if (this.queue.size() == this.limit) {
			notifyAll();
		}
		return queue.remove(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

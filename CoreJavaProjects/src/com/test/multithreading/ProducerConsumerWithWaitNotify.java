package com.test.multithreading;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

class Producer implements Runnable {
	Queue<Integer> values;
	int maxSize;
	static int i = 1;

	public Producer(Queue<Integer> values, int maxSize) {
		super();
		this.values = values;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (values) {
				while (values.size() == maxSize) {
					try {
						values.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				values.add(i++);
				System.out.println("produced " + i);
				values.notifyAll();
			}
		}
	}
}

class Consumer implements Runnable {
	Queue<Integer> values;
	int maxSize;

	public Consumer(Queue<Integer> values, int maxSize) {
		super();
		this.values = values;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (values) {
				while (values.isEmpty()) {
					try {
						values.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Integer integer = values.remove();
				System.out.println("consumed " + integer);
				values.notifyAll();
			}
		}
	}
}

public class ProducerConsumerWithWaitNotify {

	public static void main(String[] args) {
		Queue<Integer> values = new LinkedList<>();
		int maxSize = 10;

		Thread producer = new Thread(new Producer(values, maxSize));
		Thread consumer = new Thread(new Consumer(values, maxSize));

		producer.start();
		consumer.start();
	}
}

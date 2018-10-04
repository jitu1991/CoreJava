package com.test.concurrent;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		List<Integer> sharedList = new ArrayList<Integer>();
		Thread thread1 = new Thread(new Producer1(sharedList));
		Thread thread2 = new Thread(new Consumer1(sharedList));

		thread1.start();
		thread2.start();

	}
}

class Producer1 implements Runnable {
	List<Integer> sharedList = new ArrayList<Integer>();
	final int MAX_SIZE = 5;
	int i = 0;

	public Producer1(List<Integer> sharedList) {
		this.sharedList = sharedList;
	}

	public void run() {
		while (true) {
			try {
				produce(i++);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void produce(int i) throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.size() == MAX_SIZE) {
				System.out.println("List is full.... Waiting to be consumed");
				sharedList.wait();
			}
		}

		synchronized (sharedList) {
			System.out.println("Produced element " + i);
			sharedList.add(i);
			Thread.sleep(500);
			sharedList.notify();
		}
	}
}

class Consumer1 implements Runnable {
	List<Integer> sharedList = new ArrayList<Integer>();

	public Consumer1(List<Integer> sharedList) {
		this.sharedList = sharedList;
	}

	public void run() {
		while (true) {
			try {
				consume();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void consume() throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.isEmpty()) {
				System.out.println("List is empty.... Waiting to be produced");
				sharedList.wait();
			}
		}

		synchronized (sharedList) {
			Thread.sleep(1000);
			System.out.println("Consumed element" + sharedList.remove(0));
			sharedList.notify();
		}
	}
}

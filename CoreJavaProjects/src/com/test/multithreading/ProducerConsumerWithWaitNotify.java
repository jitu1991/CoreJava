package com.test.multithreading;

import java.util.ArrayList;

class Producer implements Runnable {
	ArrayList<Integer> sharedQueue;

	Producer() {
		sharedQueue = new ArrayList<Integer>();
	}

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				sharedQueue.add(i);
				System.out.println("Produced: " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Production is done, Consumer can consume");
			this.notify();
		}
	}
}

class Consumer implements Runnable {
	ArrayList<Integer> sharedQueue;
	Producer prod;

	Consumer(Producer obj) {
		prod = obj;
	}

	@Override
	public void run() {
		synchronized (sharedQueue) {
			try {
				while (sharedQueue.size() == 0) {
					System.out.println("Nothing to consume");
					sharedQueue.wait();
				}
				if(sharedQueue.size() > 0) {
					Thread.sleep(1000);
					System.out.println("Consumed: " + sharedQueue.remove(0));
					sharedQueue.notify();
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}


public class ProducerConsumerWithWaitNotify {

	public static void main(String[] args) {

	}

}

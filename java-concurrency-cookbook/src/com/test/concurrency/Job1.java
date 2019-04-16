package com.test.concurrency;

public class Job1 implements Runnable {

	PrintQueue1 queue = new PrintQueue1();
	
	public Job1(PrintQueue1 queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
		queue.printJob(new Object());
		System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
	}
}

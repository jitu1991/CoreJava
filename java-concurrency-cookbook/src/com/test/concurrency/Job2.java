package com.test.concurrency;

public class Job2 implements Runnable {

	PrintQueue2 queue = new PrintQueue2();
	
	public Job2(PrintQueue2 queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
		queue.printJob(new Object());
		System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
	}
}

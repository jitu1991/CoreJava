package com.test.concurrency;

public class Job implements Runnable {

	PrintQueue queue = new PrintQueue();
	
	public Job(PrintQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
		queue.printJob(new Object());
		System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
	}
}

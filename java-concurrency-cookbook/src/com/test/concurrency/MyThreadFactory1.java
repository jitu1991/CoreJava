package com.test.concurrency;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory1 implements ThreadFactory {
	private int counter;

	private String prefix;

	public MyThreadFactory1(String prefix) {
		this.prefix = prefix;
		counter = 1;
	}

	@Override
	public Thread newThread(Runnable r) {
		MyThread myThread = new MyThread(r, prefix + "-" + counter);
		counter++;
		return myThread;
	}
}

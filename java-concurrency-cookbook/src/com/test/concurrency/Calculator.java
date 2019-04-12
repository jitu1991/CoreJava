package com.test.concurrency;

public class Calculator implements Runnable {

	private int number;

	public Calculator(int n) {
		this.number = n;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i, i * number);
		}
	}

}

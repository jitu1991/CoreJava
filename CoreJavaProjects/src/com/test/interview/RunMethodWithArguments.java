package com.test.interview;

public class RunMethodWithArguments implements Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunMethodWithArguments());
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("default");
	}
	public void run(int n) {
		System.out.println("param");
	}

}

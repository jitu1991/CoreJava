package com.test.multithreading;

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Inside run " + Thread.currentThread().getName());
	}
	
//	@Override
//	public void start( ) {
//		System.out.println("Inside start " + Thread.currentThread().getName());
//	}
}

public class NotOverridingRun {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main has started.");

		MyThread thread1 = new MyThread();

		thread1.start();

		System.out.println("main has ended.");

	}
}

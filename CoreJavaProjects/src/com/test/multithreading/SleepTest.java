package com.test.multithreading;

class NewRunnable implements Runnable {

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Thread1")) {
			method1();
		} else {
			method2();
		}
	}
	
	synchronized void method1() {
		try {
			System.out.println("method1 started");
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			
		}
		System.out.println("method1 ended");
	}
	
	synchronized void method2() {
		try {
			System.out.println("method2 started");
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			
		}
		System.out.println("method2 ended");
	}
	
}

public class SleepTest {

	public static void main(String[] args) throws InterruptedException {
		NewRunnable runnable = new NewRunnable();
		
		Thread t1 = new Thread(runnable, "Thread1");
		Thread t2 = new Thread(runnable, "Thread2");
		t1.start();
		Thread.sleep(10);
		t2.start();
	}
}

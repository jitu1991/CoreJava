package com.test.concurrent;

public class ThreadLocalTest implements Runnable {
	private static ThreadLocal<Integer> num = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {

			if (Thread.currentThread().getName().equals("Thread1")) {
				return 10;
			} else {
				return 100;
			}
		}
	};

	//@Override
	public void run() {
		if (Thread.currentThread().getName().equalsIgnoreCase("Thread2")) {
			num.set(1000);
		}
		System.out.println(Thread.currentThread().getName()
				+ " Value of num for this thread is::" + num.get());
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable r = new ThreadLocalTest();
		Thread t1 = new Thread(r);

		t1.setName("Thread1");
		t1.start();

		Thread.sleep(500);

		Thread t2 = new Thread(r);

		t2.setName("Thread2");
		t2.start();

	}
}

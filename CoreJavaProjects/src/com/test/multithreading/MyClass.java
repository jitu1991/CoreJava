package com.test.multithreading;

class MyRunnable4 implements Runnable {

	@Override
	public void run() {
		synchronized (MyClass.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " " + Thread.currentThread().getName() + " is executing");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}

public class MyClass {
	public static void main(String args[]) throws InterruptedException {

		MyRunnable4 object1 = new MyRunnable4();
		MyRunnable4 object2 = new MyRunnable4();

		Thread thread1 = new Thread(object1, "Thread-1");
		Thread thread2 = new Thread(object2, "Thread-2");
		thread1.start();
		thread2.start();

	}

}

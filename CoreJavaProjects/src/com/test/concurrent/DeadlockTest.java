package com.test.concurrent;

public class DeadlockTest {

	String str1 = "java ";
	String str2 = "thread";
	Thread t1 = new Thread("Thread-1") {
		@Override
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(Thread.currentThread().getName()+str1 + str2);
					}

				}
			}
		}
	};
	Thread t2 = new Thread("Thread-2") {
		@Override
		public void run() {
			while (true) {
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(Thread.currentThread().getName()+str2 + str1);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
		DeadlockTest td = new DeadlockTest();

		td.t1.start();
		td.t2.start();
	}
}

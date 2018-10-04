package com.test.indiabix.threads;

public class MyThread1 extends Thread {
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
		System.out.print("one. ");
		t.start();
		System.out.print("two. ");
	}

	public void run() {
		System.out.print("Thread ");
	}
}

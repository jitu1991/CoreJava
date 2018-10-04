package com.test.indiabix.threads;

class Foo {
	int x = 5;

	public synchronized void doStuff() {
		if (x < 10) {
			// nothing to do
			try {
				wait();
			} catch (InterruptedException ex) {
			}
		} else {
			System.out.println("x is " + x++);
			if (x >= 10) {
				notify();
			}
		}
	}
}

public class ThreadTest1 {
	public static void main(String[] args) {
		final Foo f = new Foo();
		Thread t = new Thread(new Runnable() {
			public void run() {
				f.doStuff();
			}
		});
		Thread g = new Thread() {
			public void run() {
				f.doStuff();
			}
		};
		t.start();
		g.start();
	}
}

package com.test.interview;

public class ThreadDemo1 extends Thread {

	final StringBuffer sb1 = new StringBuffer();
	final StringBuffer sb2 = new StringBuffer();
	public static void main(String[] args) {
		final ThreadDemo1 h = new ThreadDemo1();
		
		new Thread() {
			public void run() {
				synchronized (this) {
					h.sb1.append("java");
					h.sb2.append("thread");
					
					System.out.println(h.sb1);
					System.out.println(h.sb2);
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				synchronized (this) {
					h.sb1.append("multithreading");
					h.sb2.append("example");
					
					System.out.println(h.sb2);
					System.out.println(h.sb1);
				}
			}
		}.start();
	}
}

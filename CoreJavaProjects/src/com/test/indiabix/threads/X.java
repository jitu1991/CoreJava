package com.test.indiabix.threads;

public class X implements Runnable {
	public static void main(String[] args) {
		X x = new X();
		Thread th = new Thread(x);
		th.start();
	}
	
	public void run() {
		
	}
}

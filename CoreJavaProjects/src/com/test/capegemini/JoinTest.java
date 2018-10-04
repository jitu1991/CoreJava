package com.test.capegemini;
class One extends Thread {
	@Override
	public void run() {
		System.out.println("One");
	}
}
public class JoinTest {
	public static void main(String[] args) {
		One one = new One();
		one.start();
		
		try {
			one.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		one.start();
	}
}

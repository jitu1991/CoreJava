package com.test.capegemini;

public class Worker extends Thread {
	
	@Override
	public void run() {
		System.out.println("|Work|");
	}

	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.start();
		worker.run();
		worker.start();
	}
	
	public void declare() {
		int a,b;
		b = 5;
		System.out.println(b);
	}
}

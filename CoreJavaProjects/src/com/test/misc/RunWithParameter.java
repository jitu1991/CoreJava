package com.test.misc;

class StartThreadWithParam implements Runnable {

	@Override
	public void run() {
		System.out.println("Process started with Thread: " + Thread.currentThread().getName());
	}
	public void run(String str) {
		System.out.println("Process started with Thread: " + Thread.currentThread().getName());
	}
	
}


public class RunWithParameter {

	public static void main(String[] args) {
		StartThreadWithParam thread = new StartThreadWithParam();
		Thread t = new Thread(thread);
		//t.run("abc");
		t.start();
		t.run();
	}

}

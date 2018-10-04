package com.test.capegemini;

import com.test.indiabix.threads.YieldTest;

public class RunningThread implements Runnable{

	public void run() {
		synchronized (RunningThread.class) {
			try {
				wait();
				//wait(100);
				//yield();
				RunningThread.class.wait(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("Done");
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunningThread());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

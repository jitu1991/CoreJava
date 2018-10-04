package com.test.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
	
	private int count = 0;
	private Lock lock = new ReentrantLock();
	
	public void increment() {
		for(int i = 0; i < 10000; i++) {
			count++;
		}
	}
	
	
	public void firstThread() throws InterruptedException {
		lock.lock();
		increment();
		lock.unlock();
		
	}


	public void secondThread() throws InterruptedException {
		increment();
	}

	
	public  void finished() {
		System.out.println("Count is: "+count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

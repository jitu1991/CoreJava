package com.test.concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	final Semaphore binarySemaphore = new Semaphore(1);

	public static void main(String[] args) {
		final SemaphoreTest test = new SemaphoreTest();
		
		new Thread() {
			public void run() {
				test.mutualExclusion();
			}
		}.start();

		new Thread() {
			public void run() {
				test.mutualExclusion();
			}
		}.start();

	}
	
	public void mutualExclusion() {
		try {
			binarySemaphore.acquire();
			System.out.println(Thread.currentThread().getName()+" Inside mutual exclusion");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			//binarySemaphore.release();
			System.out.println(Thread.currentThread().getName()+" Outside mutual exclusion");
		}

	}

}

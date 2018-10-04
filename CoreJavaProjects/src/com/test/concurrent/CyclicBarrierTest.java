package com.test.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
	
	static class Task implements Runnable {
	
		CyclicBarrier barrier;
		
		public Task(CyclicBarrier cb) {
			this.barrier = cb;
		}
		
		public void run() {
			try {
				System.out.println(Thread.currentThread().getName()+" is waiting on barrier");
				barrier.await();
				System.out.println(Thread.currentThread().getName()+" has crossed the barrier");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		final CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
			
			public void run() {
				System.out.println("All parties have arrived");
			}
		});

		
		Thread t1 = new Thread(new Task(cb), "Thread 1");
		Thread t2 = new Thread(new Task(cb), "Thread 2");
		Thread t3 = new Thread(new Task(cb), "Thread 3");
		
		t1.start();
		t2.start();
		cb.reset();
		t3.start();
	}

}

package com.test.interview;

class ThreadPriorityTest extends Thread {
	public void run() {
		System.out.println("running thread name is:"
				+ Thread.currentThread().getName()+" with priority is:"
				+ Thread.currentThread().getPriority());

	}

	public static void main(String args[]) {
		ThreadPriorityTest m1 = new ThreadPriorityTest();
		ThreadPriorityTest m2 = new ThreadPriorityTest();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
		
		String str = new String("abc");
		System.out.println("abc" == str.intern());
	}
}

package com.test.interview;

public class ThreadTest extends Thread {
	int count;
	
	public ThreadTest(int count) {
		this.count = count;
		start();
	}
	
	public void run() {
		System.out.println("run");
	}

	public static void main(String[] args) {
		/*int []i1[] = {{1,2},{1},{},{1,2,3}};
		int i2[] = new int[2]{1,2};
		int i3[][] = new int[][]{1,2,3},{4,5,6}};
		int i4[][] = {{1,2},new int[2]};
		int i5[4] = {1,2,3,4};*/
		
		ThreadTest t = new ThreadTest(10);
		//createThread(10, createThread(20, Thread.currentThread()));
	}

	static Thread createThread(final int i, final Thread t1) {
		Thread t2 = new Thread() {
			public void run() {
				System.out.println(i + 1);
				try {
					t1.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(i + 2);
			}
		};
		System.out.println(i + 3);
		t2.start();
		System.out.println(i + 4);
		return t2;
	}
}

package com.test.concurrent;

import java.util.ArrayList;

public class GenerateOddThread implements Runnable {
	private ArrayList<Integer> list;

	public GenerateOddThread(ArrayList<Integer> list) {
		this.list = list;
	}

	public void run() {
		for (int i = 1; i < 100; i++) {
			try {
				synchronized (list) {

					if (i % 2 == 0) {
						wait();
					} else {
						list.add(i);
						// wait();
						// i = i + 2;
						// notify();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(list);

	}
}
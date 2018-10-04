package com.test.concurrent;

import java.beans.EventHandler;
import java.util.ArrayList;

public class GenerateEvenThread implements Runnable {
	private ArrayList<Integer> list;

	public GenerateEvenThread(ArrayList<Integer> list) {
		this.list = list;
	}

	public void run() {
		for (int i = 0; i <= 100; i++) {
			try {
				synchronized (list) {
					if (i % 2 == 0) {
						list.add(i);
						// i = i + 2;
						// wait();
					} else {
						wait();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(list);
	}
}
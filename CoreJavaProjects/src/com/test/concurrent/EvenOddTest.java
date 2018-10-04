package com.test.concurrent;

import java.util.ArrayList;

public class EvenOddTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		
		GenerateEvenThread evenThread = new GenerateEvenThread(list);
		GenerateOddThread oddThread = new GenerateOddThread(list);

		new Thread(evenThread).start();
		new Thread(oddThread).start();

	}
}
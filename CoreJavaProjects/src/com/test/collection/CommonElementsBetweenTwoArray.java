package com.test.collection;

import java.util.ArrayList;

public class CommonElementsBetweenTwoArray {
	public static void main(String[] args) {
		ArrayList<Integer> intArray1 = new ArrayList<Integer>();
		ArrayList<Integer> intArray2 = new ArrayList<Integer>();
		// Add elements to array 1
		for (int i = 0; i <= 10; i++) {
			intArray1.add(i);
		}

		// Add elements to array 2
		for (int i = 5; i <= 10; i++) {
			intArray2.add(i);
		}

		System.out.println(intArray1);
		System.out.println(intArray2);

		// Checking common elements in array 1 and array 2
		for (int i = 0; i < intArray1.size(); i++) {
			for (int j = 0; j < intArray2.size(); j++) {
				if (intArray2.get(j).equals(intArray1.get(i))) {
					System.out.println("Common Element is "
							+ intArray2.get(j) + " Index in Array 1 -> " + i
							+ " Index in Array 2 -> " + j);

				}
			}
		}
	}
}

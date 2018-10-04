package com.test.hackerrank;

import java.util.Scanner;

public class ArrayLeftRotation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		//int noOfLeftRotation = scanner.nextInt();
		int[] intArray = new int[arraySize];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		scanner.close();
		
		/*for(int i = 0; i < intArray.length; i++) {
			intArray[i] = intArray[i+1];
		}*/
		
		intArray[0] = intArray[1];
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
        }
		
		
	}

}

package com.test.hackerrank;

import java.util.Scanner;

public class ArrayDSSolution {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] intArray = new int[n];
        
        for(int i = 0; i < intArray.length; i++) {
        	intArray[i] = scanner.nextInt();
        }
        scanner.close();
        
        
        for(int i = intArray.length-1; i >= 0; i--) {
        	System.out.println(intArray[i]);
        }
	}

}

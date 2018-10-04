package com.test.hackerrank;

import java.util.Scanner;

public class Day21Solution_1 {

	public static void main(String[] args) {
		int numOfSwaps = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1; j++) {
				if(a[j] > a[j+1]) {
					a[j] = a[j] + a[j+1];
					a[j+1] = a[j] - a[j+1];
					a[j] = a[j] - a[j+1];
					numOfSwaps++;
				}
			}
			
			// If no elements were swapped during a traversal, array is sorted
		    if (numOfSwaps == 0) {
		        break;
		    }
		}
		System.out.println("Array is sorted in "+numOfSwaps+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[a.length-1]);
		
	}
}

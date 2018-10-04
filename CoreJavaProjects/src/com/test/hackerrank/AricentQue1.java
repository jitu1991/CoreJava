package com.test.hackerrank;

import java.util.Scanner;

public class AricentQue1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numArray = new int[n];
		boolean isUnique = false;

		/*
		 * while(n-- > 0) {
			//Code
			}
		 */

		for (int i = 0; i < n; i++) {
			numArray[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.println(numArray[i]);
		}

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (numArray[i] == numArray[j]) {
					isUnique = false;
					i++;
					break;
				} else {
					isUnique = true;
					continue;
				}
			}
			if(isUnique) {
				System.out.println("Unique Element is "+numArray[i]);
				break;
			}
		}
		
		}
}

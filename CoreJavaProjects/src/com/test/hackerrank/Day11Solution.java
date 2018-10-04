package com.test.hackerrank;

import java.util.Scanner;

public class Day11Solution {
	public static void main(String[] args) {

		int hrGlsRow = 3;
		int hrsGlsCol = 3;
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		// Print Matrix
		System.out.println("Original Matrix");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		// Print First Hour Glass Matrix
		for(int i = 0; i < 4; i++) {
			while(i < hrGlsRow) {
				for(int j = 0; j < 4; j++) {
					while(j < hrsGlsCol) {
						System.out.print(arr[i][j]+" ");
						j++;
					}
				}
				i++;
				System.out.println();
			}
		}
		
		
		
		
		/*System.out.println("HourGlass Matrix");
		for (int i = 0; i < hrGlsRow; i++) {
			for (int j = 0; j < hrsGlsCol; j++) {
				if (i % 2 == 1 && j % 2 == 0) {
					System.out.print("  ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}

		// Print All Hour Glass Matrix
		System.out.println("HourGlass Matrix");
		int i = 0, j = 0;

		while(i < 4 && j < 4) {
			for (i = 0; i < hrGlsRow; i++) {
				for (j = 0; j < hrsGlsCol; j++) {
						if (i % 2 == 1 && j % 2 == 0) {
							System.out.print("  ");
						} else {
							System.out.print(arr[i][j] + " ");
						}
				}
				System.out.println();
		}
			i=i-2;
					j=j-2;
		}*/
		
	}
}

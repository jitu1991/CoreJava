package com.test.exercise;

import java.util.Scanner;

public class PrintFloydsTriangle {
	public static void main(String[] args) {
		
		/*Print No of rows according to user input*/
		System.out.println("Enter the no of lines to print of Floyd's Triangle: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num = 1;

		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num++);
			}
			System.out.println();
		}

		/*Print odd no - odd times of rows according to user input*/
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					break;
				} else
					System.out.print(i);
			}
			System.out.println();
		}

		/*Print odd no - even times of rows according to user input*/
		for (int i = 1; i <= 9;) {
			for (int j = 0; j <= i; j++) {
				if (j % 2 == 0) {
					continue;
				} else {
					System.out.print(i);
				}
			}
			i = i + 2;
			System.out.println();
		}

		/*Print odd no of rows according to user input*/
		for (int i = 1; i <= 9;) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			i = i + 2;
			System.out.println();
		}
	}
}

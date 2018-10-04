package com.test.java;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();

		int factValue = getFactorialUsingRecursion(num);
		System.out.println("Entered value is " + num);
		System.out.println("Factorial is " + factValue);

		reader.close();
	}

	
//	************************ Factorial **********************
	
	public static int getFactorialValue(int n) {
		int fact = 1;
		while (n > 1) {
			fact = fact * n;
			n--;
		}
		return fact;
	}

	public static int getFactorialUsingRecursion(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * getFactorialUsingRecursion(n - 1);
		}
	}
}

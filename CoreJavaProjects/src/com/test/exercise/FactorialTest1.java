package com.test.exercise;

public class FactorialTest1 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 6;
		System.out.println(getFactorialValue(num1));
		System.out.println(getFactorialValue(num2));
	}

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

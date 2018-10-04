package com.test.exercise;

public class ReverseInteger {
	public static void main(String[] args) {

		/** Prints Reverse of Integer - Method 1 */

		int num1 = 69871;
		String numStr = "";

		while (num1 / 10 != 0) {
			numStr = numStr + Integer.toString(num1 % 10);
			num1 = num1 / 10;
		}
		String output = numStr + num1 % 10;
		System.out.println(output);

		/** Prints Reverse of Integer - Method 1 */

		int num2 = 987654;
		int reverse = 0;
		int multiplier = 10;

		// System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.MIN_VALUE);
		// multiplier = multiplier*10;
		while (num2 / 10 != 0) {
			reverse = reverse * multiplier + num2 % 10;
			num2 = num2 / 10;

		}
		System.out.println(reverse * multiplier + num2);
	}
}

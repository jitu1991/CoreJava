/*package com.test.java;

public class DigitSumTest {
	public static int input1;
	public static int output;

	public static void main(String[] args) {
		DigitSumTest dst = new DigitSumTest();
		input1 = 234;
		int val = dst.digitSum(input1);
		System.out.println("Value is "+val);
	}

	public int digitSum(int input) {
		if(input != 0 || input != 1 || input != 2 || input != 3
				|| input != 4 || input != 5 || input != 6 || input != 7
				|| input != 8 || input != 9) {
			return sum + digitSum(input/10);
		} else {

		}
		int sum = 0;
		while (input != 0 || input != 1 || input != 2 || input != 3
				|| input != 4 || input != 5 || input != 6 || input != 7
				|| input != 8 || input != 9) {
			sum = sum + input % 10;
			input = input / 10;
		}
		//return sum;

	}
}



=========================

 */

package com.test.java;

public class DigitSumTest {

	// public int input1;
	public int sum = 0;
	public int sum1 = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DigitSumTest test = new DigitSumTest();
		int output = test.digitSum(987);
		System.out.println(output);

	}

	public int digitSum(int input) {

		while (input / 10 != 0) {
			sum = sum + input % 10;
			input = input / 10;
		}

		sum = sum + input;

		
		while (sum / 10 != 0) {
			sum1 = sum1 + sum % 10;
			sum = sum / 10;
		}
		sum1 = sum1 + sum;
		return sum1;
	}
}

package com.test.exercise;

public class ConvertBinaryToDecimal1 {
	public static void main(String[] args) {
		int binaryNum = 101;
		int decimalNum = 0;
		int power = 0;

		while (binaryNum / 10 != 0) {
			// if(binaryNum%10 == 0) {
			// break;
			// } else {
			decimalNum = (int) (decimalNum + binaryNum % 10
					* Math.pow(2, power));
			binaryNum = binaryNum / 10;
			power++;
			// }
		}
		System.out.println((int) (decimalNum + Math.pow(2, power)));
	}
}

package com.test.hackerrank;

import java.util.Scanner;

public class Day10Solution {

	//Failing Test cases with values - 524275, 951, 65535, 439 - Now resolved
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		int decimalNum = s1.nextInt();
		
		String binaryNum = "";
		while(decimalNum/2 != 0) {
			binaryNum = binaryNum+decimalNum%2;
			decimalNum = decimalNum/2;
		}
		binaryNum = binaryNum+Integer.toString(decimalNum%2);
		//System.out.println(new StringBuffer(binaryNum).reverse());
		StringBuffer binaryStr = new StringBuffer(binaryNum).reverse();
		System.out.println(binaryStr);
		
		//StringBuffer binNum = convertDecimalToBinary(decimalNum);
		//System.out.println("Binary of " + decimalNum + " is " + binNum);
		int count1 = 0;
		int tempCount = 0;
		for (int i = 0; i < binaryStr.length(); i++) {
			if(binaryStr.charAt(i)=='1') {
				count1++;
			} else {
				count1 = 0;
				continue;
			}
			
			if(count1>tempCount) {
				tempCount = count1;
			}
		}
		
		//int numOfConsecutiveOne = 1;
		//int numOfConsecutiveOneTemp = 1;
		/*for (int i = 0; i < binaryStr.length(); i++) {
			while (i + 1 < binaryStr.length()) {
				if ((binaryStr.charAt(i) == '1' && binaryStr.charAt(i + 1) == '1')) {
					numOfConsecutiveOne++;
					break;
				} else if(binaryStr.charAt(i) == '1' && binaryStr.charAt(i + 1) == '0'){
					if(numOfConsecutiveOneTemp < numOfConsecutiveOne) {
						numOfConsecutiveOneTemp = numOfConsecutiveOne;
						numOfConsecutiveOne = 1;
					}
					break;
				}
				i++;
			}
		}*/
		System.out.println("Max No Of consecutive ones " + tempCount);
		
	}

	public static StringBuffer convertDecimalToBinary(int num) {
		String binaryNum = "";
		while (num / 2 != 0) {
			binaryNum = binaryNum + num % 2;
			num = num / 2;
		}
		binaryNum = binaryNum + Integer.toString(num % 2);
		return (new StringBuffer(binaryNum).reverse());
	}
}

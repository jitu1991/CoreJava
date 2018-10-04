package com.test.hackerrank;

import java.util.Scanner;

public class AricentQue2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String str = String.valueOf(n);
		
		while(--k > 0) {
			str = str + String.valueOf(n);
		}
		
		System.out.println(str);
		
		int num = Integer.valueOf(str);
		System.out.println(calculateSuperDigit(calculateDigitSum(num)));
	}
	
	public static int calculateDigitSum(int num) {
		if(num/10 == 0) {
			return num;
		}
		return num%10+calculateDigitSum(num/10);
	}
	
	public static int calculateSuperDigit(int superDigit) {
		if(superDigit/10 == 0) {
			return superDigit;
		}
		return superDigit%10+calculateSuperDigit(superDigit/10);
	}
	
	/*public static int calculateSuperDigit(int superDigit) {
		if(superDigit/10 == 0) {
			return superDigit;
		}
		while(calculateSuperDigit(superDigit/10) != 0) {
			superDigit = superDigit%10+calculateSuperDigit(superDigit/10);
		}
		return superDigit;
	}*/
}

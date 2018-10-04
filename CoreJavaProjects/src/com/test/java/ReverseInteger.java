package com.test.java;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 987654;
		int reverse = 0;
		int multiplier = 10;
		
		//System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.MIN_VALUE);
		//multiplier = multiplier*10;
		while(num/10 != 0) {
			reverse = reverse * multiplier + num%10;
			num = num/10;
			
		}
		System.out.println(reverse * multiplier + num);
	}

}

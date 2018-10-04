package com.test.java;

public class FindSecondLargestNumber {
	
	static int count = 0;
	static int count1 = 0;
	public static void main(String[] args) {
		
		
		
		int[] num = {12,327,9,4,3,2,12,34,21,67,544,32,12,12,23,43,76,11};
		
		for(int i = 0; i< num.length; i++) {
			System.out.print(num[i]+",");
			
		}
		System.out.println("==="+num.length);
		for(int i = 1; i< num.length; i++) {
			count++;  //75
			
			int ch = num [i];
			while (i > 0 && num[i-1] > ch) {
				count1++; //58
				num[i] = num[i-1];
				i--;
			}
			num[i] = ch;
		}
	
		
	
	/*	
		for(int i = 0; i<num.length; i++) {
			count++;  //18
			for(int j = 0; j < num.length; j++) {
				count1++;  //324
				int temp;
				
				if(num[i] > num[j]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}*/

		System.out.println("==="+num.length);
		for(int i = 0; i< num.length; i++) {
			System.out.println(num[i]);
		}

		System.out.println("=====count==="+count);
		System.out.println("=====count1==="+count1);
		
	}

}

package com.test.exercise;

public class SortAndFindSecondLargestNumber {
	static int count, count1 = 0;
	public static void main(String[] args) {

		/** Sorting Array - Method 1 */
		int[] num = {12,327,9,4,3,2,12,34,21,67,544,32,12,12,23,43,76,11};

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
		}
		System.out.println("==="+num.length);
		for(int i = 0; i< num.length; i++) {
			System.out.println(num[i]);
		}

		/** Sorting Array - Method 2 */

		int[] num1 = {12,327,9,4,3,2,12,34,21,67,544,32,12,12,23,43,76,11};

		for(int i = 0; i< num1.length; i++) {
			System.out.print(num1[i]+",");
		}
		System.out.println("==="+num1.length);
		for(int i = 1; i< num1.length; i++) {
			count++;  //75

			int ch = num1 [i];
			while (i > 0 && num1[i-1] > ch) {
				count1++; //58
				num1[i] = num1[i-1];
				i--;
			}
			num1[i] = ch;
		}
		for(int i = 0; i< num1.length; i++) {
			System.out.print(num1[i]+",");
		}
	}
}

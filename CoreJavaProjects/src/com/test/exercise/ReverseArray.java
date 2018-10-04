package com.test.exercise;

public class ReverseArray {
	public static void main(String[] args) {
		int[] intArray = {1,2,4,5,76,4,4};
		int left = 0;
		int right = intArray.length - 1;
		for(left = 0; left < right; left++, right--) {
			int temp = intArray[left];
			intArray[left] = intArray[right];
			intArray[right] = temp;
		}
		
		for(int i =0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
			
		}

	}

}

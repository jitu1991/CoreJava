package com.test.altimetrik;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int array[] = new int[5];
		for(int i =5; i > 0; i--) {
			array[5-i]=i;
		}

		Arrays.sort(array);
System.out.println(Arrays.binarySearch(array, 4));


	}
}
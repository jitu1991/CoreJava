package com.test.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		int numArray[] = {1, 2, 3, 3,3, 5, 6, 8, 9, 10, 11, 13 };

		System.out.println(Arrays.toString(numArray));
		Arrays.sort(numArray);
		System.out.println(Arrays.toString(numArray));

		int num = numArray[0];
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] != num) {
				System.out.println(/* i+" is repeated at ["+ i + "]" */ "Missing number " + num);
				if (numArray[i - 1] == numArray[i]) {
					System.out.println("Duplicate " + numArray[i]);
					i++;
				}
				i--;
			}
			num++;
		}
	}

	/*int num = numArray[0];
	for(int i = 0;i<numArray.length;i++) {
		if (numArray[i] != num) {
			System.out.println(num);
			i--;
		}
		num++;
	}*/

}

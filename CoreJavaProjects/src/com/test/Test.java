package com.test;

import java.util.*;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		int[] arr = {15, 4, -2, 2, -3, 1, 3, 3, 0};
		int targetSum = 4;

	/*	4 ==> len 1
		4, -2, 2 ==> len 3
		-3, 1, 3, 3 ==> len 4
		-3, 1, 3, 3, 0 ==> len 5
		-2, 2, -3, 1, 3, 3, 0 ==> len 7
		1, 3 ==> len 2*/

//output: Max length is 7

		int maxLength = 0;
		for(int i = 0; i < arr.length; i++) {
			int tempLengh=0;
			if(arr[i] == targetSum) {
				tempLengh++;
				maxLength = tempLengh;
			}

			int sum = arr[i];
			for(int j =i+1; j < arr.length; j++) {
				sum += arr[j];
				System.out.println("i=>" + arr[i] + " j =>" + arr[j] + " sum" +sum);
				if(sum == targetSum) {
					tempLengh = (j - i) + 1;
				}
				//System.out.println("sum at end of loop=>"+ sum);
			}

			//System.out.println("templength=>"+ tempLengh + " maxLengh=>" + maxLength);
			if(tempLengh > maxLength) {
				maxLength = tempLengh;
			}
		}

		System.out.println(maxLength);


	}

	/*public void test(Object student) throws RuntimeException {
		//Refactor the below code following the Java 8 coding standards

		new Predicate<Object>().test(student == null)

		if (student == null) {
			throw new RuntimeException();
		}

		callStudentDetails(student);



	}*/

	//no modification required
	private void callStudentDetails (Object student) {
		//business logic
		System.out.println("call student method is called");
	}
}
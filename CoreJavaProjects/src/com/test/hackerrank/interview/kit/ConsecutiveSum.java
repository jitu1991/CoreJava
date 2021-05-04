package com.test.hackerrank.interview.kit;

public class ConsecutiveSum {

	public static void main(String[] args) {
		System.out.println((int) Math.round(0.5));
		System.out.println(findSum(21));
	}

	public static int findSum(int num) {
		int val1=1;
	    int val2=1;
	    int noOfWays = 1;
	    int expectedSum=1;
	    while(val2<num) {
	        if(expectedSum == num) {
	            noOfWays++;
	            expectedSum -=val1;
	            val1++;
	            val2++;
	            expectedSum+=val2;
	    } else if(expectedSum < num) {
	        val2++;
	        expectedSum+=val2;
	    } else {
	        expectedSum -=val1;
	        val1++;
	    }
	    
	}
	return noOfWays;
	}
}

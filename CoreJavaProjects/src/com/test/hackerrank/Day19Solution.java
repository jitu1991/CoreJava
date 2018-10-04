package com.test.hackerrank;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

	/*Here is a tip, a number's divisor will always be 1 and the number itself. 
	 * So you can initialize the sum as n+1 itself. And the start the loop from 
	 * i=2 till i<=n/2 because the greatest divisor of the number will not be 
	 * greater than its half. Hence by this you shorten your for loop. Also place 
	 * a condition at start for n=1 then just return 1. Otherwise that test case 
	 * wont be successful
*/	public int divisorSum(int n) {
		int divisorSum = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				divisorSum += i;
			}
		}
		return divisorSum;
	}
}
	
public class Day19Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: "
				+ myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}

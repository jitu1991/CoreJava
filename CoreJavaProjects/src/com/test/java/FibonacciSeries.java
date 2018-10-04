package com.test.java;

public class FibonacciSeries {

	static int num1 = 0;
	static int num2 = 1;
	static int sum = 0;

	public static void main(String[] args) {
		
		
		//Fibonacci Series
		/*while(sum < 25) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			//System.out.println(num);
			//sum = num;
			System.out.println(sum);
		}*/
		
		//Fibonacci Series using recursion
		
		int count = 10;
		printFibonacci(count-2);
		
	}
	
	public static void printFibonacci(int n) {
		if(n > 0) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.println(sum);
			printFibonacci(n-1);
		}
	}
}

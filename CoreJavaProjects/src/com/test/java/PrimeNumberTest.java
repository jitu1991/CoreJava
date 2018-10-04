package com.test.java;

public class PrimeNumberTest {
	public static void main(String[] args) {
		int num = 2;
		boolean isPrime = false;


		System.out.println(Math.sqrt(17));
		/* Program to find Prime Number till nth Number */
		for(int i = 2; i <= num; i++) {
			for(int j = 2; j <= i; j++) {
				if(i==j) {
					//System.out.println("Prime "+i);
					continue;
				} else if(i%j==0) {
					isPrime = false;
					break;
				} else if(i%j!=0)	{
					isPrime = true;
					//System.out.println("Prime "+i);
					continue;
				}
			}
			if(isPrime) {
				System.out.println("Prime " + i);
			} 
		}




		/* Program to find Given Number is prime or not */

		for(int i = 1; i < num; i++) {
			if(i==1) {
				continue;
			}
			if(num%i==0) {
				isPrime = false;
				break;
				//continue;
			} else {
				isPrime = true;
				continue;
			}
		}

		if(isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}


	}
}

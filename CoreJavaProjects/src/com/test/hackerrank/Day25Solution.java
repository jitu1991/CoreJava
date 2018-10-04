package com.test.hackerrank;

import java.util.Scanner;

public class Day25Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] numArray = new Integer[n];
        
        for(int i = 0; i < n; i++) {
        	numArray[i] = scanner.nextInt();
        }
        
        for(int num : numArray) {
        	if(checkPrimeNumber(num)) {
        		System.out.println("Prime");
        	} else {
        		System.out.println("Not Prime");
        	}
        }
	}
	
	public static boolean checkPrimeNumber(int number) {
		boolean isPrime = false;
		for(int i = 2; i < number; i++) {
			if(number == 2) {
				isPrime = true;
				continue;
			}
			if(number%i==0) {
				isPrime = false;
				break;
				//continue;
			} else {
				isPrime = true;
				continue;
			}
		}
		return isPrime;
	}
}

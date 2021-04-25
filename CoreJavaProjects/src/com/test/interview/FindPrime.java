package com.test.interview;

public class FindPrime {

	public static void main(String[] args) {
		System.out.println(findGroup(10));
	}
	
	public static int findGroup(int input1) {
		int low = 2;
		int high = input1+1;
		int noOfGroups=1;

		while(low <= high) {
			boolean isPrime = false;
			if(low <=3) {
				low++;
				continue;
			}
			
			for(int i =2; i <low; ++i) {
				if(low %i ==0) {
					isPrime = false;
					break;
				} else {
					isPrime=true;
					continue;
				}
			}
			
			if(isPrime) {
				noOfGroups++;
			}
				++low;
			}
			return noOfGroups;
		}
	}

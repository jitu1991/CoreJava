package com.test.hackerrank;
import java.util.Scanner;
public class Day30Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfTest = in.nextInt();
		
		for(int i = 0 ; i <noOfTest; i++) {
			int max = 0;
			int n = in.nextInt();
			int k = in.nextInt();
			
			for(int a = 1; a < n-1; a++) {
				for(int b = a + 1; b <= n; b++) {
					int val = a&b;
					
					if(val > max && val < k) {
						max = val;
					}
				}
			}
			System.out.println(max);
		}
	}
}

package com.test.hackerrank;

import java.util.Scanner;

class Calculator1 {
	
	int power(int n, int p) throws Exception {
		if(n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			return (int)Math.pow(n, p);
		}
	}
	
}

public class Day17Solution {
	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator1 myCalculator = new Calculator1();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

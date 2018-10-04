package com.test.hackerrank;

import java.util.Scanner;

public class Day7Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i = 1; i <= arr.length; i++) {
        	System.out.print(arr[arr.length-i]+" ");
        }
        
        
        in.close();
	}

}

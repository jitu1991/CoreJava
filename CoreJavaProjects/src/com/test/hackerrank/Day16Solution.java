package com.test.hackerrank;

import java.util.Scanner;

public class Day16Solution {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
            System.out.println(Integer.parseInt(S));
        } catch(NumberFormatException nfe) {
        	System.out.println("Bad String");
        }
        
    }
}

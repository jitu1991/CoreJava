package com.test.hackerrank;

import java.util.Scanner;

public class Day6Solution {

	public static String evenString="", oddString="";
		public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		String[] dataStore = new String[n];
		s1.nextLine();

		for(int i=0;i<n;i++) {
			dataStore[i] = s1.nextLine();
		}
		
	    for (int i = 0; i < dataStore.length; i++) {
	    	saveEvenOddIndexString(dataStore[i]);
	    	evenString="";
	    	oddString="";
	    }
}
	
	public static void saveEvenOddIndexString(String str) {
		for(int i = 0; i< str.length(); i++) {
			if(i%2==0) {
				evenString = evenString+str.charAt(i);
			} else 
				oddString = oddString+str.charAt(i);
		}
		System.out.println(evenString+" "+oddString);
	}
}
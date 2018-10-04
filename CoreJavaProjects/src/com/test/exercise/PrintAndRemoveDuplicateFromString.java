package com.test.exercise;

public class PrintAndRemoveDuplicateFromString {

	public static void main(String[] args) {
		String test = "haaabcfddgaefgha";
		StringBuilder str = new StringBuilder(test);
		
		System.out.println(printAndRemoveDuplicatesFromString(str));
	}
	
	private static StringBuilder printAndRemoveDuplicatesFromString(StringBuilder test) {
		for(int i = 0; i<test.length(); i++) {
			for(int j = i+1; j<test.length();j++) {
				if(test.charAt(i) != test.charAt(j)) {
					continue;
				} else {
					System.out.println("Duplicate character "+test.charAt(i)+" at index "+i+" and "+j);
					System.out.println("Removing "+test.charAt(i)+" from index "+j);
					test.deleteCharAt(j);
					printAndRemoveDuplicatesFromString(test);
					break;
				}
			}
		}
		return test;
	}
}

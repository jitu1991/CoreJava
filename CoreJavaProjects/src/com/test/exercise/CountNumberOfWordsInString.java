package com.test.exercise;

public class CountNumberOfWordsInString {
	public static void main(String[] args) {
		String str = "ramnath   go";
		
		String[] str1 = str.split("\\s");
		System.out.println(str1.length);
		
		for(int i = 0; i<str1.length;i++) {
			//System.out.println(str1[i]);
		}
		

	}

}

package com.test.java;

import java.util.Arrays;
import java.util.List;

public class AnagramStringTest {
	public static void main(String[] args) {
		String str1 = "prsmp";
		String str2 = "prsma";

		boolean isAnagram = false;

		char[] originalString = str1.toCharArray();
		char[] anagramString = str2.toCharArray();
		Arrays.sort(originalString);
		Arrays.sort(anagramString);

		if(originalString.length == anagramString.length) {
			for(int i = 0; i < originalString.length; i++) {
				for(int j = 0; j < anagramString.length; j++) {
					if(originalString[i] != anagramString[j]) {
						isAnagram = false;
						continue;
					} else
						isAnagram = true;
					break;
				}
				if(!isAnagram) {
					break;
				}
			}
		}
		if(isAnagram) {
			System.out.println("String is Anagram");
		} else
			System.out.println("Not Anagram");
		
		
		/*
		 * boolean isAnagram = false; if (str1.length() == str2.length()) { char[]
		 * s1AsChar = str1.toCharArray(); char[] s2AsChar = str2.toCharArray();
		 * Arrays.sort(s1AsChar); Arrays.sort(s2AsChar); isAnagram =
		 * Arrays.equals(s1AsChar, s2AsChar); }
		 */

		if(isAnagram)

		{
			System.out.println("Anagram");
		} else

		{
			System.out.println("not Anagram");
		}

	}

	
}

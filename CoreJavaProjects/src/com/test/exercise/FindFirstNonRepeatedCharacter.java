package com.test.exercise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindFirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "abcdefabc";
		/**
		 * Find First Non Duplicate using Set Bug in case character is repeated
		 * odd times
		 * */

		Set<Character> set = new LinkedHashSet<Character>();

		for (int x = 0; x < str.length(); x++) {
			char myChar = str.toCharArray()[x];
			if (set.add(myChar)) {
				set.add(myChar);
			} else {
				set.remove(myChar);
			}
		}
		System.out.println(new ArrayList(set).get(0));

		/** Find First Non Duplicate using nested for loop */

		ArrayList<Character> charArrayList = new ArrayList<Character>();
		char[] nonRepeat = str.toCharArray();

		for (int i = 0; i < nonRepeat.length; i++) {
			boolean isRepeated = false;
			if (!charArrayList.isEmpty()
					&& charArrayList.contains(nonRepeat[i])) {
				// System.out.println(nonRepeat[i]);
			} else {
				for (int j = i + 1; j < nonRepeat.length; j++) {
					if (nonRepeat[i] == nonRepeat[j]) {
						isRepeated = true;
						charArrayList.add(nonRepeat[i]);
						break;
					}
				}
				if (!isRepeated) {
					System.out.println(nonRepeat[i]);
					break;
				}
			}
		}
	}
}

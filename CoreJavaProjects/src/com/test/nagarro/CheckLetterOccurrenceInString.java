package com.test.nagarro;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CheckLetterOccurrenceInString {

	public static void main(String[] args) {
		//TODO Check each letter occurence in a string and print them alphabatically
		String str = "abcddddefjffjjjj";
		
		//Sort by key
		Map<Character, Integer> letterCountMap = new TreeMap<>();
		for(Character c : str.toCharArray()) {
			Integer count = letterCountMap.get(c);
			if(count != null) {
				letterCountMap.put(c, count + 1);
			} else {
				letterCountMap.put(c, 1);
			}
		}
		System.out.println("Sort by key " + letterCountMap);
		
		//Sort by value
		List<Map.Entry<Character, Integer>> entryList = new LinkedList(letterCountMap.entrySet());
		Collections.sort(entryList, valueComparator);
		
		Map<Character, Integer> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<Character, Integer> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("Sort by Value " + sortedMap);
	}
	
	static Comparator<Map.Entry<Character, Integer>> valueComparator = new Comparator<Map.Entry<Character, Integer>>() {

		@Override
		public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
			return o1.getValue().compareTo(o2.getValue());
		}
	};

}

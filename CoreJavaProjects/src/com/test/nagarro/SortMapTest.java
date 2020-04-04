package com.test.nagarro;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortMapTest {

	public static void main(String[] args) {
		Map<String, Integer> testMap = new HashMap<>();
		testMap.put("b", 3);
		testMap.put("a", 1);
		testMap.put("e", 4);
		testMap.put("z", 3);
		testMap.put("r", 2);
		
		System.out.println(testMap);
		
		Set<String> orderedSet = new TreeSet<>(testMap.keySet());
		System.out.println(orderedSet);
		
		Map<String, Integer> newMap = new LinkedHashMap<>();
		orderedSet.forEach(x -> newMap.put(x, testMap.get(x)));
		System.out.println(newMap);
		
	}

}

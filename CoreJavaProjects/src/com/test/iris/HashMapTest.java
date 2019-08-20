package com.test.iris;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {
	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "b";
		
		HashMap<String, String> strMap = new HashMap<>();
		/*strMap.put(str1, "AA");
		strMap.put(str1, "BB");
		strMap.put(str2, null);
		strMap.put("c", null);
		strMap.put(null, "aaa");
		strMap.put(null, "bbbb");
		
		System.out.println(strMap.get(null));*/
		
		strMap.put("za", "aba");
		strMap.put("aa", "erefre");
		strMap.put("cc", "rfe");
		strMap.put("bb", "erfe");
		
		System.out.println(strMap);
		
		Map<String, String> treeMapTest = new TreeMap<>(strMap);
		System.out.println(treeMapTest);
	}

}

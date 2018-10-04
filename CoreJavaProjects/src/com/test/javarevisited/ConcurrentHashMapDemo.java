package com.test.javarevisited;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("Kindle", 100);
		map.put("Samsung Tab", 200);
		map.put("iPad", 500);
		map.put("Mini", 400);

		System.out.println("All keys of ConcurrentHashMap");

		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

		System.out.println("Printing keys and value pairs");

		Set<Map.Entry<String, Integer>> set = map.entrySet();

		// Using Enhanced for loop
		for (Map.Entry<String, Integer> me : set) {
			System.out.println("Key: " + me.getKey() + " Value: "
					+ me.getValue());
		}

		// Using iterator

		Iterator<Map.Entry<String, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key: " + key + " value: " + value);
		}
	}
}
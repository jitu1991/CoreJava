package com.test.misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashmapTest {

	public static void main(String[] args) {
		/*Map<String, String> empMap = new HashMap<>();
		
		empMap.put("101", "abc");
		empMap.put("102", "pqr");
		empMap.put("103", "xyz");
		
		
		for(Entry str : empMap) {
			
		}
		
		Iterator itr = empMap.keySet().iterator();
		
		while(itr.hasNext()) {
			String entry = (String) itr.next();
			System.out.println("Key: "+ entry + " Value: " + empMap.get(entry));
		}*/
		
		Equal eq1 = new Equal();
		Equal eq2 = new Equal();
		Equal eq3 = new Equal();
		
		Map<Equal, String> testMap = new ConcurrentHashMap();
		testMap.put(eq1, "eq1");
		testMap.put(eq2, "eq2");
		testMap.put(eq3, "eq3");
		
		System.out.println(testMap.size());
		
		System.out.println(testMap.get(eq2));
	}
}

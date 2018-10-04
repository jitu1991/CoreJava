package com.test.misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapTest {

	public static void main(String[] args) {
		Map<String, String> empMap = new HashMap<>();
		
		empMap.put("101", "abc");
		empMap.put("102", "pqr");
		empMap.put("103", "xyz");
		
		
		/*for(Entry str : empMap) {
			
		}*/
		
		Iterator itr = empMap.keySet().iterator();
		
		while(itr.hasNext()) {
			String entry = (String) itr.next();
			System.out.println("Key: "+ entry + " Value: " + empMap.get(entry));
		}
		
		
	}

}

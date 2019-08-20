package com.test.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
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
		
		/*Equal eq1 = new Equal();
		Equal eq2 = new Equal();
		Equal eq3 = new Equal();
		
		Map<Equal, String> testMap = new ConcurrentHashMap();
		testMap.put(eq1, "eq1");
		testMap.put(eq2, "eq2");
		testMap.put(eq3, "eq3");
		
		System.out.println(testMap.size());
		
		System.out.println(testMap.get(eq2));*/
		
		/*Map<String, Map<String, String>> testMap = new HashMap();
		Map<String, String> strMap = new HashMap<>();
		
		strMap.put("a", "aa");
		strMap.put("b", "bb");
		
		testMap.put("1", strMap);
		
		System.out.println(testMap);
		Map<String, String> map = testMap.get("1");
		map.put("c", "cc");
		System.out.println(strMap);*/
		
		/*List<String> list1 = Arrays.asList("AUD", "1", "2");
		List<String> list2 = Arrays.asList("CAD", "1", "2");
		List<String> list3 = Arrays.asList("HKK", "1", "2");
		List<String> list4 = Arrays.asList("UJD", "1", "2");
		
		List<List<String>> lists = new ArrayList();
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		lists.add(list4);

		Map<String, Integer> map = new HashMap<>();
		int counter = 0;
		for(List<String> list : lists) {
			if(counter < lists.size()) {
				String string = list.get(0);
				map.put(string, counter);
				counter++;
			}
		}
		
		System.out.println(map);
		
		StringTokenizer st = new StringTokenizer("Hello World");
		while (st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}*/
		
		/*Map<String, Integer> testMap = new HashMap();
		testMap.put("a", 1);
		testMap.put("b", 2);
		int i = testMap.get("a");
		//System.out.println(i);
		
		String a="|b";
		String[] split = a.split("\\|");
		for(String s: split) {
			//System.out.println(s);
		}
		Double d = "".toString();
		System.out.println(new Double(""));*/
		
		Double d = 45.552488745;
		System.out.println(Math.round(d));
	}
}

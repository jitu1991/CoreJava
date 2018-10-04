package com.test.iris;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>();

		treeMap.put("a", "aa");
		treeMap.put("b", "bb");
		
		treeMap.firstEntry().setValue("bbbbbbb");
		
		//Map.Entry<String, String> mm = treeMap.firstEntry();
		//mm.setValue("zz");
		System.out.println(treeMap);
		//System.out.println(mm);

	}

}

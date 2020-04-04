package com.test.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExample {
	public static void main(String[] args) {
		/*List<String> lists = new ArrayList<>();
		lists.add("A");
		lists.add("B");
		lists.add("C");

		Iterator<String> itr = lists.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println("List Value:" + value);
			if (value.equals("A"))
				lists.remove(value);
		}*/
		
		/*Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				//myMap.put("1", "4");
				myMap.put("4", "4");
			}
		}*/
		
		/*List<String> myList = new CopyOnWriteArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		System.out.println("List Size:" + myList.size());
		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3")) {
				myList.remove("4");
				myList.add("6");
				myList.add("7");
			}
		}
		System.out.println("List Size:" + myList);*/
		
	}
}

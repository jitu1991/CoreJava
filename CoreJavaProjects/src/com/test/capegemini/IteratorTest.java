package com.test.capegemini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Windows");
		myList.add("Linux");
		myList.add("Mac OS");
		int index = 0;
		
		for(Iterator<String> itr = myList.iterator(); itr.hasNext();) {
			System.out.println(myList.get(index++));
		}
	}
}

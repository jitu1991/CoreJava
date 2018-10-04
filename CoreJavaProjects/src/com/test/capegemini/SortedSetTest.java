package com.test.capegemini;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
	public static void main(String[] args) {
		// Create the sorted set
		SortedSet set = new TreeSet();

		// Add elements to the set
		set.add("z");
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("1");
		set.add("4");
		set.add("5");

		// Iterating over the elements in the set
		Iterator it = set.iterator();

		while (it.hasNext()) {
			// Get element
			Object element = it.next();
			System.out.println(element.toString());
		}
	}
}

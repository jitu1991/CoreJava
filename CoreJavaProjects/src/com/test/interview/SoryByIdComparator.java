package com.test.interview;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import com.test.java.Person;

public class SoryByIdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		return p1.getName().compareTo(p2.getName());
	}
}

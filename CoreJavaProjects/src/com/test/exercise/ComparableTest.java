package com.test.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest implements Comparable<ComparableTest>{

	private int i;
	private String str;
	
	public ComparableTest(int i, String str) {
		super();
		this.i = i;
		this.str = str;
	}

	@Override
	public int compareTo(ComparableTest o) {
		//return this.i - o.i;
		return this.str.compareTo(o.str);
	}
	
	public static void main(String[] args) {
		ComparableTest obj1 = new ComparableTest(5, "e");
		ComparableTest obj2 = new ComparableTest(1, "a");
		ComparableTest obj3 = new ComparableTest(4, "d");
		List<ComparableTest> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		Collections.sort(list);
		
		list.forEach(x -> System.out.println(x.i));
	}
}

package com.test.capegemini;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
class Fashion {
	
	/*public Fashion() {
		System.out.println("Fashion");
	}*/

	@Override
	public String toString() {
		return "Fashion";
	}
}
public class SetTest {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("Alaska");
		s.add(new Fashion());
		
		Set t = new TreeSet();
		t.add("Alaska");
		t.add(new Fashion());
		
		//System.out.println(new Fashion());
		System.out.println(s);
		System.out.println(t);
	}
}
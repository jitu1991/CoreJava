package com.test.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set empSet = new HashSet<Employee>();
		empSet.add(new Employee(33, "First"));
		empSet.add(new Employee(33, "First"));
		empSet.add(new Employee(35, "Second"));
		
		Iterator itr = empSet.iterator();
		while(itr.hasNext()) {
			Employee e = (Employee) itr.next();
			System.out.println(e.getName());
		}
	}
}

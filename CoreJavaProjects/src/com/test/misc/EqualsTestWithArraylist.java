package com.test.misc;

import java.util.ArrayList;
import java.util.List;

public class EqualsTestWithArraylist {

	public static void main(String[] args) throws Exception {
		int[] a = {1,2,3,4};
		List<Person> personList = new ArrayList<>();
		
		Person p1 = new Person(1, "a");
		Person p2 = new Person(2, "b");
		Person p3 = new Person(3, "c");
		Person p4 = new Person(3, "d");

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		if(!personList.contains(p4)) {
			personList.add(p4);	
		}
		
		for(Person p : personList) {
			System.out.println("id -> " + p.getId() +" Name -> "+p.getName());
		}
	}
}

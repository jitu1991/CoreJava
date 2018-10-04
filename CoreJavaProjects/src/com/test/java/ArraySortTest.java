package com.test.java;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		person[0] = new Person(3, "a");
		person[1] = new Person(2, "b");
		person[2] = new Person(1, "c");
		
		System.out.println();
		
		for(Person p: person) {
			System.out.println(p.getName());
		}
	}

}

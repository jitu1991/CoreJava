package com.test.interview.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.test.java.Person;

public class DuplicateListTest {
	public static void main(String[] args) {
		Person p1 = new Person(1, "AA");
		Person p2 = new Person(2, "BB");
		
		List<Person> list1 = new ArrayList<>();
		list1.add(p1);
		list1.add(p2);
		
		p1.setName("XX");
		
		List<Person> list2 = list1;
		System.out.println(list1);
		System.out.println(list2);
	}
}

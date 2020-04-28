package com.test.interview.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.test.java.Person;

public class ListContainsTest {
	public static void main(String[] args) {
		//Find overlapping routes
		/*input - 4
		2,8|6,10|12,14|12,20
		Here 6 to 10 is overlapping and 12-20 is overlapping with 12-14
		hence 2 overlaps*/
		
		Person p1 = new Person(1, "AA");
		Person p2 = new Person(2, "BB");
		Person p3 = new Person(3, "CC");
		Person p4 = new Person(4, "x");
		Person p5 = new Person(5, "t");
		Person p6 = new Person(6, "y");
		Person p7 = new Person(7, "f");
		Person p8 = new Person(8, "e");
		Person p9 = new Person(9, "r");
		
		List<String> toSearch = Arrays.asList("BB", "t", "CC");
		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		
		List<Person> collect = list.stream().filter(x -> toSearch.contains(x.getName())).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}

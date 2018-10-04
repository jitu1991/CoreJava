package com.test.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.InlineView;

import com.test.java.Person;

class Person3 implements Comparable {
	private int id;
	private String name;
	
	public Person3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/*@Override
	public int compareTo(Object o) {
		Person3 p = (Person3) o;
		System.out.println(this.id - p.id);
		return this.id - p.id;
	}*/
	
	@Override
	public int compareTo(Object o) {
		Person3 p = (Person3) o;
		System.out.println(this.name.compareTo(p.name));
		return this.name.compareTo(p.name);
	}
	
	/*@Override
	public String toString() {
		return String.valueOf(id);
	}*/
	
	@Override
	public String toString() {
		return name;
	}
}

public class ArrayListTest {

	public static void main(String[] args) {
		/*List<Integer> intList = new ArrayList<Integer>();
		intList.add(44);
		intList.add(2);
		intList.add(1);
		intList.add(87);
		Collections.sort(intList);
		System.out.println(intList);*/
		
		/*List<Person3> personList = new ArrayList<Person3>();
		Person3 p1 = new Person3(18, "c");
		Person3 p2 = new Person3(6, "a");
		Person3 p3 = new Person3(7, "b");

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);

		Collections.sort(personList);
		
		for(Person3 p : personList) {
			System.out.println(p);
		}*/
		
		List<Person> personList = new ArrayList<Person>();
		Person p1 = new Person(18, "c");
		Person p2 = new Person(6, "a");
		Person p3 = new Person(99, "b");

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		Collections.sort(personList, new SoryByIdComparator());
		
		for(Person p : personList) {
			System.out.println(p);
		}
	}

}

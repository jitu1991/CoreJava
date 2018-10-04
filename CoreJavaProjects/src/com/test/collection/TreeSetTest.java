package com.test.collection;

import java.util.Iterator;
import java.util.TreeSet;

import com.test.java.Person;

public class TreeSetTest {

	public static void main(String[] args) {
		/*TreeSet map = new TreeSet();
		map.add("zz");
		map.add("two");
		map.add("three");
		map.add("one");
		
		Iterator it = map.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		Person p1 = new Person("a");
		Person p2 = new Person("b");
		Person p3 = new Person("c");
		TreeSet<Person> personSet = new TreeSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);

		Iterator it = personSet.iterator();

		while (it.hasNext()) {
			System.out.println("s: " + it.next());
		}
		

	}

}

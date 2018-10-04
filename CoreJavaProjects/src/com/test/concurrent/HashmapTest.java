package com.test.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.test.java.Person;

public class HashmapTest {
	public static void main(String[] args) {
		Person per1 = new Person("Person 1");
		Person per2 = new Person("Person 2");
		Person per3 = new Person("Person 3");
		Person per4 = new Person("Person 4");

		Map<Person, String> hashmapTest = new HashMap<Person, String>();
		
		hashmapTest.put(per1, "Person 1");
		hashmapTest.put(per2, "Person 2");
		hashmapTest.put(per3, "Person 3");
		hashmapTest.put(per4, "Person 4");
		
		/*System.out.println(per1.hashCode());
		System.out.println(per2.hashCode());
		System.out.println(per3.hashCode());
		System.out.println(per4.hashCode());*/
		
		/*Iterate using for each loop
		for(Person key : hashmapTest.keySet()) {
			System.out.println(hashmapTest.get(key));
		}*/
		
		//Iterate Using keyset Iterator

		/*Set<Person> keySet = hashmapTest.keySet();
		Iterator<Person> keySetIterator = keySet.iterator();
		System.out.println("Iterating using Keyset iterator");
		while(keySetIterator.hasNext()) {
			Person key = keySetIterator.next();
			System.out.println("Key: "+key+" Value: "+hashmapTest.get(key));
		}*/
		
		for(Map.Entry<Person, String> map : hashmapTest.entrySet()) {
			System.out.println("Key "+map.getKey()+" Value "+ map.getValue());
		}
	}
}

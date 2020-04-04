package com.test.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Misc {
	public String name;
	public int age;
	
	public Misc(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	};
	
	@Override
	public String toString() {
		return name + " "+ age;
	}
}

public class MiscTest {
	public static void main(String[] args) {
		List<String> strings = new ArrayList();
		strings.add("BB");
		strings.add("DD");
		
		List<Misc> miscObjs = new ArrayList<>();
		Misc m1 = new Misc("AA", 21);
		Misc m2 = new Misc("BB", 22);
		Misc m3 = new Misc("DD", 23);
		Misc m4 = new Misc("BB", 24);
		
		miscObjs.add(m1);
		miscObjs.add(m2);
		miscObjs.add(m3);
		miscObjs.add(m4);
		
		List<Misc> collect = miscObjs.stream().filter(data -> strings.contains(data.name)).collect(Collectors.toList());
		System.out.println(collect);
		
		Object obj = 9.5;
		
		double d = 8.5;
		
		//obj = d;
		double s = (double) obj;
		//System.out.println(Double.valueOf(""));
		System.out.println("".isEmpty());
	}
}

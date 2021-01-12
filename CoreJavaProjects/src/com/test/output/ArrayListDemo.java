package com.test.output;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(10);
		list.add(10);

		System.out.print(list.size());

		list.remove(new Integer(10));
		list.remove(new Integer(10));
		
		//System.out.print(list.size());
		
		List subList = new ArrayList();

		subList.add(1);
		subList.add(2);
		subList.add(3);
		subList.add(4);
		subList.add(5);
		subList.add(6);
		subList.add(7);
		subList.add(8);
		subList.add(9);
		subList.add(10);
		subList.add(11);
		subList.add(12);
		
		System.out.println(subList);
		System.out.println(subList.subList(0, 10));

	}

}
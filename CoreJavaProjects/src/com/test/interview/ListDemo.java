package com.test.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> subList = new ArrayList<Integer>();
		List<Integer> subList1 = new ArrayList<Integer>();
		subList.add(1);
		subList.add(2);
		subList.add(3);
		subList.add(4);
		
		subList1 = subList.subList(1, 4);
		subList1.remove(2);
		
		System.out.println(subList1);

	}

}

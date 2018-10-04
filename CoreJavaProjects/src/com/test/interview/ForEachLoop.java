package com.test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		List<Object> objList = new ArrayList<Object>();
		Integer inta = new Integer(45);
		objList.add("a");
		objList.add(1);
		objList.add('a');
		objList.add(inta);
		
		Iterator it = objList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(objList.size());
	}
}

package com.test.interview;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		/*String str = "test1";
		TreeSet<String> strTreeSet = new TreeSet<String>();
		strTreeSet.add("test1");
		strTreeSet.add("test2");
		strTreeSet.add(new String(str));

		
		strTreeSet.tailSet(str);
		Iterator it = strTreeSet.iterator();

		while (it.hasNext()) {
			String s = (String)it.next();
			System.out.println("s: " + s);
			if (it.next().equals("test1")) {
				strTreeSet.remove("aa");
			}
		}*/

		TreeSet<Object> strTreeSet = new TreeSet<Object>();
		strTreeSet.add("");
		//strTreeSet.add(new Object());
		strTreeSet.add("");

		System.out.println(strTreeSet.size());
		Iterator it = strTreeSet.iterator();

		while (it.hasNext()) {
			String s = (String)it.next();
			//System.out.println("s: " + s);
			if (it.next().equals("test1")) {
				strTreeSet.remove("aa");
			}
		}
	}

}

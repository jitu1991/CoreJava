package com.test.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MusicalChairDemo {
	public static void main(String[] args) {
		List<Integer> listOfValue = new ArrayList();
		listOfValue.add(1);
		listOfValue.add(2);
		listOfValue.add(3);
		listOfValue.add(4);
		listOfValue.add(5);
		listOfValue.add(6);
		
		HashSet<Integer> aa = new HashSet<Integer>();
		
		HashMap<String, String> aa1 = new HashMap<String, String>();
		aa1.put("A", "B");
		

		// System.out.println(listOfValue.size());
		int count = 5;

		for (int i = 0; i < 5; i++) {
			// for (int j = 0; j < 5; j++) {
			// count++;
			int j = 4;
			//if (count == 5) {
				// System.out.println(listOfValue.size());
				if (j < listOfValue.size()) {
					System.out.println(listOfValue.remove(j));
				} else {
					int newIndex = count % listOfValue.size() - 1;
					System.out.println(listOfValue.remove(newIndex));
				}
			//}
			// }
			//count = 0;
		}

		System.out.println("Remaining value is: " + listOfValue);

	}

}

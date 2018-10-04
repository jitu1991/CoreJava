package com.test.capegemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LastOrders {
	public static void main(String[] args) {
		String[] array = {"slurs","slush","slurps","slurry"};
		List<String> list1 = Arrays.asList(array);
		Collections.sort(list1,LastOrders.comparatorX());
		System.out.println(list1);
		int index1 = Collections.binarySearch(list1, "slurry", LastOrders.comparatorX());
		System.out.println(list1+" Slurry at: "+index1);
	}
	
	public static Comparator<String> comparatorX() {
		return new Comparator<String>() {
			public int compare(String str1, String str2) {
				StringBuilder sb1 = new StringBuilder(str1);
				StringBuilder sb2 = new StringBuilder(str2);
				System.out.println(sb1.reverse().toString());
				System.out.println(sb2.reverse().toString());
				return sb2.reverse().toString().compareTo(sb1.reverse().toString());
			}
		};
	}
}

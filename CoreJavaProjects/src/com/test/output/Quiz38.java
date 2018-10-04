package com.test.output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz38 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size());
		Integer[] arr = { 2, 10, 3 };
		list = Arrays.asList(arr);
		System.out.println(list.size());
		//list.set(0, 3);
		//System.out.println(list);
		list.add(1);
		System.out.println(list);
	}

}
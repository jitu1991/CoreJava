package com.test.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {
		double num1 = 139.11;
		double num2 = 13266.13;
		double num3 = 13373.21;
		
		List<String> strList= new ArrayList<>();
		List<Double> doubleList= new ArrayList<>();

		doubleList.add(num3);
		doubleList.add(num2);
		doubleList.add(num1);
		
		strList.add(String.valueOf(num1));
		strList.add(String.valueOf(num2));
		strList.add(String.valueOf(num3));
		
		Collections.sort(strList);
		Collections.sort(doubleList);
		
		System.out.println(doubleList);
		System.out.println(strList);
		
	}

}

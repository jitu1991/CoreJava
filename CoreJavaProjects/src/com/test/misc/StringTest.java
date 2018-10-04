package com.test.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		String str = "abc";
		changeName(str);
		System.out.println(str);
		changeName(null);
		
		List<String> l = returnList();
		
		for(String s : l) {
			System.out.println(s);
		}
		
		
	}
	
	public static void changeName(String str1) {
		str1 = "bcd";
		System.out.println("in String");
	}
	
	public static void changeName(int name) {
		System.out.println("in name");
	}
	
	public static List returnList() {
		List list = Arrays.asList("A","b","c");
		return list;
	}

}



//in String
//abc
//in String
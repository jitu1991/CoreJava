package com.test.linkedin;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("abc");
		list.add(2);
		System.out.println(list.get(0) instanceof String);
		System.out.println(list.get(1) instanceof Integer);
	}
}

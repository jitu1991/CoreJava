package com.test.misc;

import java.util.ArrayList;
import java.util.List;

public class ValidateName {
	public static void main(String[] args) {
		/*String regex = "[a-zA-Z0-9_-]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("");
		System.out.println(matcher.matches());*/
		
		/*String str="abc|def";
		String changed = str.replaceAll("\\|","/");
		System.out.println(changed);*/
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		list1.retainAll(list2);
		System.out.println(list1);

	}
}

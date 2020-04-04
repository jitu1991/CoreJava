package com.test.indiabix.operatorandassignment;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Test p = new Test();
		p.start();
		
		String s = "A, b, c";
		List<String> split = Arrays.asList(s.split(","));
		split.stream().forEach(x -> x.trim());
		System.out.println(split);
	}


	void start() {
		boolean b1 = false;
		boolean b2 = fix(b1);
		System.out.println(b1 + " " + b2);
	}

	boolean fix(boolean b1) {
		b1 = true;
		return b1;
	}
	
	
}
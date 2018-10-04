package com.test.misc;

class AAA {
	public void test() {
		System.out.println("test in parent");
	}
	
	public void test1() {
		System.out.println("test1 in parent");
	}
}

class BBB extends AAA {

	public void test() {
		System.out.println("test in child");
	}
	
	public void test3() {
		System.out.println("test3 in child");
	}
}

public class OverridingTest {

	public static void main(String[] args) throws Exception {
		AAA a = new BBB();
		a.test();
	}
}

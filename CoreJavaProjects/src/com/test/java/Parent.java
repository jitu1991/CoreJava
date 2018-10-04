package com.test.java;

public class Parent {
	static int x = 20;
	public static void main(String []args) {
		Child p = new Child();
		System.out.println(p.x);
		
	}
}

class Child extends Parent {
	static int x = 30;
}


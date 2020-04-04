package com.test.java;

public interface Interface1 {
	int a =10;
	static int staticVar = 5;
	public void show();
	
	default void defaultMethod() {
		System.out.println("default method in interface1");
	}
	
	static void staticMethod() {
		System.out.println("Static method in interface1");
	}
}
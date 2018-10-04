package com.test.java;

public class InterfaceTest implements Interface1, Interface2 {
	
	public void show() {
		System.out.println("Show method:"+Interface1.a);
	}
	
	public static void main(String[] args) {
		Interface2 impl = new InterfaceTest();
		impl.show();
		System.out.println("In main:"+impl.a);
	}
}

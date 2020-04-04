package com.test.java;

public class InterfaceTest implements Interface1, Interface2 {
	
	public void show() {
		System.out.println("Show method:"+Interface1.a);
	}
	
	/*@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		Interface1.super.defaultMethod();
	}*/
	
	public void staticMethod() {
		System.out.println("static method in main");
	}

	public static void main(String[] args) {
		/*Interface2 impl = new InterfaceTest();
		impl.show();
		System.out.println("In main:"+impl.a);*/
		
		InterfaceTest impl = new InterfaceTest();
		impl.staticMethod();
		
		Interface1.staticMethod();
		System.out.println(Interface1.staticVar);
		Interface1 test = new InterfaceTest();
		test.defaultMethod();
	}
}

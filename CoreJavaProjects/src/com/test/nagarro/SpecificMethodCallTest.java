package com.test.nagarro;

public class SpecificMethodCallTest {
	public static void main(String[] args) {
		SpecificMethodCallTest test = new  SpecificMethodCallTest();
		test.method1(null);
	}
	
	public void method1(Object obj) {
		System.out.println("Object called");
	}
	
	public void method1(String str) {
		System.out.println("String called");
	}
	
	/*public void method1(Integer str) {
		System.out.println("Integercalled");
	}*/
}

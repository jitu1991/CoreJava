package com.test.niit;
class A {
	/*A(String s) {
		
	}*/
}

class B extends A {
	/*B(String s) {
		
	}*/
}
public class StaticStringTest {
	static String s = "static";
	
	public static void main(String[] args) {
	
		StaticStringTest test = new StaticStringTest();
		s = "updated static";
		String s = "local string";
		
		System.out.println(s);
	}
}

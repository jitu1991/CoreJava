package com.test.capegemini;

public class MyClass {
	public static void main(String[] args) {
		MyClass a;
		MySubClass b;
		a = new MyClass();
		b = new MySubClass();
		a = b;
		//b = a;
	}
}
class MySubClass extends MyClass {}

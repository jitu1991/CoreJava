package com.test.oracle;

interface AnotherInterface {
	default void myMethod() {
		System.out.println("Default method in interface");
	}
}

interface NewInterface extends AnotherInterface {
	/*static void myMethod() {
		System.out.println("default method in second interface");
	}*/
}
public class SuperInterfaceTest implements NewInterface {

	public static void main(String[] args) {
		AnotherInterface i = new SuperInterfaceTest();
		i.myMethod();
	}
	
	/*public void myMethod() {
		System.out.println("method in main class");
	}*/
}

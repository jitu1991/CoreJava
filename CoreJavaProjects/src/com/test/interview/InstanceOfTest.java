package com.test.interview;

import java.util.Collection;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

public class InstanceOfTest {
	public static void main(String[] args) {
		
		
		D b = new D();
		A a = b;
		
		if(a instanceof A) {
			System.out.println("A");
		}
		if(a instanceof B) {
			System.out.println("B");
		}
		if(a instanceof C) {
			System.out.println("C");
		}
		if(b instanceof A) {
			System.out.println(b instanceof A);
		}
	}
	
	public void method(Collection<?> t) {
		
		
	}
}

package com.test.interview;

class Parent {
	public static void name() {
		System.out.println("static in parent");
	}
	
	public void display() {
		System.out.println();
	}
}

class Child extends Parent {
	public static void name() {
		System.out.println("static in child");
	}

	/*public static void display() {
		System.out.println();
	}*/
}

public class StaticOverrideTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.name();

		p = new Child();
		p.name();

		Child c = new Child();
		c.name();
		
		StaticOverrideTest st = new StaticOverrideTest();
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		byte b = (byte)129;
		System.out.println(b);
		st.display(b);
	}

	public void display(int a, int b) {
		System.out.println("inside multiple int display " + a);
	}

	public void display(int... a) {
		System.out.println("inside varargs display " + a);
	}

	public void display(byte b) {
		System.out.println("inside byte display " + b);
	}

}

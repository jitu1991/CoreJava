package com.test.iris;

class A {
	int a = 1;
	static int b = 2;
	public static void name() {
		System.out.println("static name in parent");
	}

	public void display() throws Exception {
		System.out.println("non static display in Parent");
	}
	
	public void test() {
		System.out.println("test in parent");
	}
	
	public void test1() {
		System.out.println("test1 in parent");
	}
}

class B extends A {
	int a = 3;
	static int b = 4;
	public static void name() {
		System.out.println("static name in child");
	}

	@Override
	public void display() throws NullPointerException{
		System.out.println("non static display in child");
	}

	public void test() {
		System.out.println("test in child");
	}
	
	public void test3() {
		System.out.println("test3 in child");
	}
}

public class OverridingTest {

	public static void main(String[] args) throws Exception {
		A p = new B();
		//p.name();
		p.display();
		System.out.println(p.a);
		System.out.println(p.b);
		
		p.test();
		p.test1();
	}
}

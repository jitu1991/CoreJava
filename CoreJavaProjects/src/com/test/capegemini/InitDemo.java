package com.test.capegemini;
class Foo {
	private int i;
	public void f() {
		System.out.println("f in Foo");
	}
	public void g() {
		System.out.println("g in Foo");
	}
}

class Bar extends Foo {
	public int j;
	public void g() {
		System.out.println("g in bar");
	}
}

public class InitDemo {
	public static void main(String[] args) {
		Foo a = new Foo();
		Bar b = new Bar();
		a.g();
		b.f();
	}
}

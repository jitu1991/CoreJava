package com.test.misc;

import java.io.IOException;

@FunctionalInterface
interface abc {
	public void setName();
}

class A {
	public void show(int i) throws IOException {
		System.out.println("show in parent");
	}

}

class B extends A {
	@Override
	public void show(int s) throws NullPointerException {
		System.out.println("show in child");
	}

}

public class Test {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Test t = new Test(); t.handle(null); }
	 * 
	 * 
	 * public void handle(String str) { System.out.println("In String"); }
	 * 
	 * public void handle(int i) { System.out.println("In integer"); }
	 */

	public static void main(String[] args) {
		Ballon red = new Ballon("Red"); // memory reference 50
		Ballon blue = new Ballon("Blue"); // memory reference 100

		swap(red, blue);
		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

		foo(blue);
		System.out.println("blue color=" + blue.getColor());
		

	}

	private static void foo(Ballon balloon) { // baloon=100
		balloon.setColor("Red"); // baloon=100
		balloon = new Ballon("Green"); // baloon=200
		balloon.setColor("Blue"); // baloon = 200
	}

	// Generic swap method
	public static void swap(Object o1, Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}
}

package com.test.interview;

import java.io.IOException;

class Building {
	//1. Super class doesn't throw any exception
	/*void color() {
		System.out.println("Blue");
	}*/
	
	//3. When base class and child class both throws a checked exception
	void color() throws NullPointerException {
		System.out.println("Blue");
	}
}

public class OverridingWithExceptions extends Building {
	//1. It throws an unchecked exception
	//2. If base class doesn’t throw any exception but child class throws an checked exception, compilation fails
	/*void color() throws NullPointerException {
		System.out.println("White");
	}*/
	
	//3. When base class and child class both throws a checked exception
	/*void color() throws IOException {
		System.out.println("White");
	}*/
	

	//4.  When child class method is throwing border checked exception compared to the same method of base class, compilation fails
	/*void color() throws Exception {
		System.out.println("White");
	}*/

	void color() {
		System.out.println("White");
	}
	public static void main(String args[]) {
		Building obj = new Building();
		try {
			obj.color();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

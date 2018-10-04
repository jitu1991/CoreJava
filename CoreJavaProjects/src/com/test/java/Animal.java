package com.test.java;

public class Animal {
	protected int var;

	public void eat() {
		System.out.println("Animal eating");
	}
}
class Dog extends Animal {
	Animal an = new Animal();
	//an.var = 10;
}
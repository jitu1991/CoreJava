package com.test.exercise;

class superClass {
	public void display(int n) {
		System.out.println(n);
	}
}

public class InheritenceWithOverloading extends superClass {
	public static void main(String[] args) {
		InheritenceWithOverloading in = new InheritenceWithOverloading();
		in.display(10);
		in.display(1, 2);
	}
	
	public void display(int a, int b) {
		System.out.println(a+" "+b);
	}

}

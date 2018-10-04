package com.test.output;

public class Hi extends Greeting {

	public static void main(String[] args) {

		new Hi();
		new Hi("Hi");
	}

	Hi() {
		this("Hello");
	}

	Hi(String s) {
		super(s);
	}
}
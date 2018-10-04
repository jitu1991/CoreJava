package com.test.output;

public class ClassC extends ClassB {

	String hello() {
		return "C";
	}

	public static void main(String[] args) {
		ClassA[] msgs = new ClassA[3];

		msgs[0] = new ClassB();
		msgs[1] = (ClassA) new ClassC();
		msgs[2] = (ClassA) new ClassB();

		for (ClassA a : msgs)
			System.out.print(a.hello());
	}

}

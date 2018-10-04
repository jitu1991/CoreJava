package com.test.interview;

public class BlankFinalVariable {

	private final int blankFinalVariable; // must be initialized in a
											// constructor

	public BlankFinalVariable() {
		this(6); // this is Ok
		// this.blankFinalVariable = 3;
	}

	public BlankFinalVariable(int number) {
		this.blankFinalVariable = number;
	}

	public static void main(String args[]) {
		BlankFinalVariable clazz = new BlankFinalVariable();
		System.err.println("Value of blank final variable in Java : "
				+ clazz.blankFinalVariable);
	}

}

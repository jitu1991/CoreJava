package com.test.java;

public class ExceptionExample {
	
	int i;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExceptionExample ex = new ExceptionExample();
		int c = ex.add();
		System.out.println(c);

	}
	
	public int add() {
		try {
			i++;
			
		}
		finally {
			System.out.println("finally");
		}
		return i;
	}

}

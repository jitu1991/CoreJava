package com.test.java;

public class ABC {

	public int x;
	
	public void test(ABC abc) {
		abc.x = 30;
		abc = null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ABC ab = new ABC();
		ab.x = 20;
		System.out.println(ab.x);
	}
}

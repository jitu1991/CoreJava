package com.test.java;

public class FinallyTest {
	public static void main(String[] args) {
		// System.out.println(1.1/0.0);
		System.out.println(finallyTest());

	}

	public static int finallyTest() {
		try {
		int i = 4;
		int j = 0;
		int k = i/j;
		return k;
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		return 2;
		/*StringBuffer x = new StringBuffer();
		try {
			return x.append("try");
			// throw new NullPointerException();
			// return "try";
		} catch (Exception e) {
			return x.append("catch");
		} finally {
			return x.append("finally");
		}*/
	}

}

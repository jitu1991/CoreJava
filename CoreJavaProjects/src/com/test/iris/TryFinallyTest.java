package com.test.iris;

public class TryFinallyTest {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;

		System.out.println(returnNum(x, y));
	}

	public static int returnNum(int a, int b) {
		try {
			++b;
			//return a + b;
			throw new Exception();
		} catch (Exception e) {
			return a;
		} finally {
			return b;
		}
	}

}

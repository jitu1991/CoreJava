package com.test.indiabix.flowcontrol;

public class DoWhileTest {
	public static void main(String[] args) {
		/*
		 * int i = 1, j = 10; do { if (i > j) { break; } j--; } while (++i < 5);
		 * System.out.println("i = " + i + " and j = " + j);
		 */

		int I = 1;
		do
			while (I > 1)
				System.out.print("I is " + I);
		while (I > 1);
			System.out.println("inside while");

		/*
		 * int I = 0; outer: while (true) { I++; inner: for (int j = 0; j < 10;
		 * j++) { I += j; if (j == 3) continue inner; break outer; } continue
		 * outer; } System.out.println(I);
		 */
	}
}

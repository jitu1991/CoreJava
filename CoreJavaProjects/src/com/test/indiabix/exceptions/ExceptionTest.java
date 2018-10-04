package com.test.indiabix.exceptions;

import java.io.FileOutputStream;

public class ExceptionTest {
	class TestException extends Exception {
	}

	public void runTest() throws TestException {
	}

	public void test() throws Exception /* Point X */
	{
		runTest();
	}

	public static void main(String[] args) {
		/*
		 * try { badMethod(); System.out.print("A"); } catch (Exception ex) {
		 * System.out.print("B"); } finally { System.out.print("C"); }
		 * System.out.print("D");
		 */

		try {
			System.out.println("Hello world ");
			throwit();
			System.out.println("Done with try block ");
		} finally {
			System.out.println("Finally executing ");
		}
	}

	public static void badMethod() {
		throw new Error(); /* Line 22 */
	}

	public static void throwit() {
		throw new RuntimeException();
	}
}

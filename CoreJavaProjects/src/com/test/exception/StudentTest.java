package com.test.exception;

public class StudentTest {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();

		try {
			Student student = manager.find("123456");
			System.out.println("A");
		} catch (StudentNotFoundException ex) {
			System.err.print(ex);
		}
	}
}
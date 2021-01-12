package com.test.linkedin;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println(print(1));
	}
	
	static Exception print(int x) {
		if(x>0) {
			return new Exception();
		} else {
			throw new RuntimeException();
		}
	}
}

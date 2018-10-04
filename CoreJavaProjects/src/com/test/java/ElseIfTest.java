package com.test.java;

public class ElseIfTest {
	
	public static int i = 1;

	public static void main(String[] args) {
		if (1 > 2) {
			System.out.println("Inside if");
		} else if (1 > 3) {
			System.out.println("Inside else if");
		} else {
			System.out.println("inside else");
		}
		
		if(++i > 0) {
			System.out.println(i);
		}
	}
}

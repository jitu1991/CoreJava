package com.test.interview;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int i = 1;
		/*do {}while(i < 1); {
			System.out.println(i);
		}*/
		
		do while(i < 1) 
			System.out.println(i++);
		while(i > 1);
	}
}
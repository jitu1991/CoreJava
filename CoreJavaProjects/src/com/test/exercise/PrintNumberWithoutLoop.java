package com.test.exercise;

public class PrintNumberWithoutLoop {
	static int temp = 1;
	public static void main(String[] args) {
		printNumWithoutLoop(100);

	}
	
	public static void printNumWithoutLoop(int num) {
		//int temp = 1;
		if(temp <= num) {
			System.out.println(temp++);
			printNumWithoutLoop(num);
		}
	}

}

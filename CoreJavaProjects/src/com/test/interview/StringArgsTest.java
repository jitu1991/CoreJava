package com.test.interview;

public class StringArgsTest {

	//To Define arguments go to Run -> Run Configuration -> Arguments
	public static void main(String[] args) {
		
		
		for (int x = 1; x < args.length; x++) {
			System.out.print(args[x] + " ");
		}
	}
}

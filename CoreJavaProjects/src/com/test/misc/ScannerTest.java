package com.test.misc;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		String input = "1 2 a 3 4 5 6";
		Scanner sc = new Scanner(input);
		int x = 0;
		
		do {
			x = sc.nextInt();
			System.out.println(x + " ");
		} while (x != 0);
	}
}

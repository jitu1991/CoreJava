package com.test.java;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i1 = scan.nextInt();
		//double d1 = scan.nextDouble();
		scan.nextLine();
		String s1 = scan.nextLine();

		System.out.format("Input number is %d",i1);
		System.out.println(s1);
	}

}

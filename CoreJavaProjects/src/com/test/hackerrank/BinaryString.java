package com.test.hackerrank;

public class BinaryString {

	BinaryString(String string) {
		for (byte b : string.getBytes()) {
			System.out.print(b+" ");
			//System.out.print(Integer.toBinaryString(b) + " ");
		}
		System.out.println();
	}

	BinaryString(Integer integer) {
		System.out.println(Integer.toBinaryString(integer));
	}

	public static void main(String[] args) {
		new BinaryString(" ");
		new BinaryString(8675309);
	}
}

package com.test.interview;

public class VarArgsDemo {
	public static void main(String[] args) {
		byte b = 3;
		convert(b,b,b);

	}
	
	public static void convert(int a, int b, int c) {
		System.out.println("inside multiple int parameters");
	}

	public static void convert(int... c) {
		System.out.println("inside int varargs parameters");
	}

	public static void convert(byte a, byte b, byte c) {
		System.out.println("inside multiple byte parameters");
	}

	public static void convert(byte... c) {
		System.out.println("inside byte varargs parameters");
	}
}

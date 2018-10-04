package com.test.iris;

public class ByteTest {
	public static void main(String[] args) {
		byte b1 = (byte) 128;
		byte b2 = 3;
		
		byte b3 = (byte) (b1 + b2);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(b3);

	}

}

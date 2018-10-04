package com.test.iris;

public class NullParamTest {
	public static void main(String[] args) {
		NullParamTest np = new NullParamTest();
		np.display(null);
		
		final byte b1 = 2;
		final byte b2 = 3;
		byte b4 = b1+b2;
		System.out.println(b4);
	}
	
	public void display(int a) {
		System.out.println("int "+a);
	}

	public void display(String a) {
		System.out.println("String "+a);
	}
}

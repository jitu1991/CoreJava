package com.test.interview;
class ToString {
	int a = 4;
	String str = "NoName";
	
	@Override
	public String toString() {
		return "ToStringObject";
	}
}

public class ToStringTest {
	public static void main(String[] args) {
		ToString ts = new ToString();
		System.out.println(ts);
	}
}

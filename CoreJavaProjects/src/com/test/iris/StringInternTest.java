package com.test.iris;

public class StringInternTest {

	public static void main(String[] args) {
		String str1 = "a";
		String str2 = new String("a");
		String str3 = "a";
		str2 = str2.intern();
		
		System.out.println(str1 == str2);

	}

}

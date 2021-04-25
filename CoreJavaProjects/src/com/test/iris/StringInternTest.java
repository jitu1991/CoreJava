package com.test.iris;

public class StringInternTest {

	public static void main(String[] args) {
		String str1 = "a";
		String str2 = new String("a");
		String str4 = str2.intern();
		String str3 = "a";
		//str2 = str2.intern();
		
		//System.out.println(str1.hashCode());
		//System.out.println(str2.hashCode());
		//System.out.println(str3.hashCode());
		
		System.out.println(str3 == str4);

	}

}

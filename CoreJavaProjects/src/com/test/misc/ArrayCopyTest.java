package com.test.misc;

import java.util.Arrays;

public class ArrayCopyTest {
	public static void main(String[] args) {
		String[] str1 = new String[3];
		str1[0] = "fff";
		str1[1] = "b";
		str1[2] = "c";
		
		String[] copyOf = Arrays.copyOf(str1, str1.length);
		copyOf = str1;
		
		for(int i = 0; i< str1.length; i++) {
			System.out.println(str1[i]);
		}
		
		for(int i = 0; i< copyOf.length; i++) {
			System.out.println(copyOf[i]);
		}

	}
}

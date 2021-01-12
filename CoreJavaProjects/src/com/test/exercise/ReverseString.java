package com.test.exercise;

import java.lang.reflect.Array;

public class ReverseString {
	public static void main(String[] args) {
		String a = new String("bc");
		String x = new String("xy");
		a = a+1;
		a=null;
		System.out.println(x.hashCode());
		x=x+"d";
		System.out.println(x.hashCode());
		
		
		
		String str = "abcdef jj";
		/*char[] strToChar = str.toCharArray();
		
		char[] outString = new char[strToChar.length];
		//for(int i = 1; i <= strToChar.length; i++) {
			for(int j = 0; j < strToChar.length;) {
				//System.out.println("===="+strToChar[strToChar.length-j]);
				outString[j++] = strToChar[strToChar.length-j];
				System.out.println(outString);
			}*/
		//}		
		//System.out.println(outString);
		
		/*StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		System.out.println(strToChar);
		System.out.println("strToChar"+strToChar);
		
		for(char a: strToChar) {
			System.out.println(a);
		}*/

		/*int[] testArray =  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(testArray);*/

	}
	
}

package com.test.misc;

public class SubstringTest {

	public static void main(String[] args) {
		String str = "IR Shock Liq Adj Y";
		String liq = "Liq Adj ";
		int indexOf = str.indexOf(liq);
		
		if(str.endsWith("Y")) {
			System.out.println("yes");
		}
		System.out.println(str.substring(indexOf,str.length()));
	}

}

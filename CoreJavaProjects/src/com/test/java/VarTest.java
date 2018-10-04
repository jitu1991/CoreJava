package com.test.java;

public class VarTest {
	public static void main(String[] args) {
		final double d = 1/2;
		System.out.println(d);
		
		Var temp = new Var();
		
		
		temp.setI(40);
		
		System.out.println(temp.i);
		
		Var temp1 = new Var();
		
		System.out.println("Temp1: "+temp1.i);
	}

}

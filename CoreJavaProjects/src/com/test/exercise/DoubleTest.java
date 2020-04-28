package com.test.exercise;

import java.text.DecimalFormat;

public class DoubleTest {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Object d;
		int i = 8;
		d=i;
		System.out.println(d);
		
		double val = 41113.55543333;
		System.out.println(df.format(val));
	}

}

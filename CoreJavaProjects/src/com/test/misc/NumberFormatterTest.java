package com.test.misc;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatterTest {
	public static void main(String[] args) {
		String numPatter = "#,##0.00;(#,##0.00)";
		
		DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
		df.applyPattern(numPatter);
		
		System.out.println("Positive: " + df.format(105.984));
		System.out.println("Negative: " + df.format(-100));
		
	}
}

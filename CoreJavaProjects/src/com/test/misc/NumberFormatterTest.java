package com.test.misc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatterTest {
	public static void main(String[] args) {
		String numPatter = "#,##0.00;(#,##0.00)";
		
		DecimalFormat df = new DecimalFormat("0,000");
		//df.applyPattern(numPatter);
		
		System.out.println("Positive: " + df.format(143545125454405.987));
		System.out.println("Negative: " + df.format(-100));
		System.out.println(NumberFormat.getNumberInstance().format(1233345.208));
		
		String val = "123456.7865";
		double doubleValue = BigDecimal.valueOf(Double.parseDouble(val)).setScale(2, RoundingMode.HALF_UP).doubleValue();
		System.out.println(val);
		System.out.println(doubleValue);
	}
}

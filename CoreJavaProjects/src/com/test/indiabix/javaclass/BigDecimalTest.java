package com.test.indiabix.javaclass;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BigDecimalTest {
	public static void main(String[] args) {
		double val = 12.33;
		BigDecimal valueOf = BigDecimal.valueOf(val);
		String plainString = valueOf.toPlainString();
		
		System.out.println("BigDecimal " + valueOf);
		System.out.println("PlainString " + valueOf);
		
		Double a = Double.valueOf(plainString);
		//System.out.println(a);

		DecimalFormat formatter = new DecimalFormat("0.00");
		System.out.println(formatter.format(Double.valueOf("5")));
		//System.out.println(formatter.format(val/1000000));
		
		/******************** Using BigDecimal ***************/
		
		/*String currStr = "0.03";
		String prevStr = "0.00";
		
		BigDecimal currAmt = BigDecimal.valueOf(Double.valueOf(currStr));
		BigDecimal prevAmt = BigDecimal.valueOf(Double.valueOf(prevStr));
		
		//BigDecimal absoluteValue = currAmt.subtract(prevAmt).abs();
		BigDecimal absChange = currAmt.subtract(prevAmt).abs();
		
		System.out.println(absChange);
		
		BigDecimal relativeChange = absChange.divide(prevAmt, 2, RoundingMode.HALF_DOWN);
		BigDecimal percentChange = relativeChange.multiply(new BigDecimal(100)).setScale(2, RoundingMode.HALF_DOWN);
		
		System.out.println("relative change bigdecimal => " + relativeChange);
		System.out.println("percentage change bigdecimal => " + percentChange);*/
		
		
/******************** Using Double ***************/
		
		/*String currExpStr = "1.52";
		String prevExpStr = "1.47";
		
		Double currAmtDbl = Double.valueOf(currExpStr);
		Double prevAmtDbl = Double.valueOf(prevExpStr);
		
		//BigDecimal absoluteValue = currAmt.subtract(prevAmt).abs();
		Double absChangeDbl = Math.abs(prevAmtDbl - currAmtDbl);*/
		
		//System.out.println(absChange);
		
		/*Double relativeChangeDbl = absChangeDbl/ prevAmtDbl;
		Double percentChangeDbl = relativeChangeDbl * 100;
		
		System.out.println("relative change double => " + relativeChangeDbl);
		System.out.println("percentage change double => " + percentChangeDbl);
		
		DecimalFormat df = new DecimalFormat("0.00");
		String format = df.format(percentChangeDbl);
		//System.out.println(format);
		BigDecimal a = new BigDecimal(0.0);
		BigDecimal b = new BigDecimal(0);
		
		System.out.println(a.compareTo(b));
		String[] split = "6".split("\\|");
		for(int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println(split.length);*/

	}
}

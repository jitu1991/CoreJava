package com.test.indiabix.javaclass;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathRoundTest {

	public static void main(String[] args) {
		double data = 3452.645;
		String val = "4.5";
		int value = (int)Math.round(Double.valueOf(val));
		System.out.println(Math.round(Double.valueOf(val)));
		
		BigDecimal curr = BigDecimal.valueOf(11.5);
		BigDecimal prev = BigDecimal.valueOf(14);
		
		BigDecimal change = curr.subtract(prev).abs().setScale(2, RoundingMode.HALF_DOWN);
		System.out.println(change);
		
		/*System.out.println(value);
		
		double values[] = {-2.3, -1.0, 0.25, 4};
        int cnt = 0;
        
        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(5.24545));
        for (int x=0; x < values.length; x++) 
        {
            if (Math.round(values[x] + .5) == Math.ceil(values[x])) 
            {
            	
            	System.out.println(Math.round(values[x]));
            	System.out.println(Math.ceil(values[x]));
                ++cnt;
            }
        }
        System.out.println("same results " + cnt + " time(s)");*/
	}

}

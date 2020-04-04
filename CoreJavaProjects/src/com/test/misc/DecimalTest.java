package com.test.misc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalTest {
	public static void main(String[] args) {
		/*double input = 3.14159265359;
        System.out.println("double : " + input);
        System.out.println("double : " + df2.format(input));    //3.14

        // DecimalFormat, default is RoundingMode.HALF_EVEN
        df2.setRoundingMode(RoundingMode.DOWN);
        System.out.println("\ndouble : " + df2.format(input));  //3.14

        df2.setRoundingMode(RoundingMode.UP);
        System.out.println("double : " + df2.format(input));    //3.15
*/
        double input = 3.14059265359;
        System.out.println("double : " + input);

        BigDecimal bd = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();

        System.out.println("double : " + newInput);
	}
}

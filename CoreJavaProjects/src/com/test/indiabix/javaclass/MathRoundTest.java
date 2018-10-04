package com.test.indiabix.javaclass;

public class MathRoundTest {

	public static void main(String[] args) {
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
        System.out.println("same results " + cnt + " time(s)");
	}

}

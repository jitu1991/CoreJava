package com.test.java;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {
		
		 int a = 9;
	        a += (a = 3);  // first example
	        System.out.println(a);
	        int b = 9;
	        b = b + (b = 3);  // second example
	        System.out.println(b);
	        
		
	       /* ******************* Reverse String ****************************/
		String str = "abcdef";
        char[] strToChar = str.toCharArray();
        char[] outString = new char[strToChar.length];
        
            for(int j = 0; j < strToChar.length; ) {
               outString[j++] = strToChar[strToChar.length-j];
            }
            
            System.out.println(outString);
            
//            ******************** Convert Binary to Decimal ***********************
            
		int binaryNum = 110111;
		int decimalNum = 0;
		int power = 0;
		
		while(binaryNum/10 != 0) {
//			if(binaryNum%10 == 0) {
//				break;
//			} else {
				decimalNum = (int) (decimalNum + binaryNum%10*Math.pow(2, power));
				binaryNum = binaryNum/10;
				power++;
			//}
		}
		System.out.println((int)(decimalNum+Math.pow(2, power)));
	}
}

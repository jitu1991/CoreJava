package com.test.java;

public class FinallyTest {
	public static void main(String[] args) {
		//System.out.println(1.1/0.0);
		finallyTest();
		

	}
	
	public static StringBuffer finallyTest() {
		StringBuffer x = new StringBuffer();
		try {
			return x.append("try");
            //throw new NullPointerException();
            //return "try";
     } catch (Exception e) {
            return x.append("catch") ;
     } finally {
            return x.append("finally");
     }
	}

}

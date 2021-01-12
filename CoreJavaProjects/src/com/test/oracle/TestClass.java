package com.test.oracle;

public class TestClass {
	int i;
	String s;
	boolean b;
	
	public int getI() {return i;}
	public String getS() {return s;}
	public boolean getB() {return b; }

	public static void main(String[] args) {
		int i1;
		String s1;
		boolean b1;
		
		TestClass t = new TestClass();
		System.out.printf("i= %d, s=%s, b=%b", t.getI(), t.getS(), t.getB());
		//System.out.printf("i1= %d, s1=%s, b1=%b", i1, s1, b1);
	}
}

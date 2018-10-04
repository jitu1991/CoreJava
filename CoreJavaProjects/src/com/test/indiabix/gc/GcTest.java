package com.test.indiabix.gc;

public class GcTest {
	public static void main(String[] args) {
		GcTest gc = new GcTest();
		GcTest gc1 = new GcTest();
		gc = null;
		
		gc = new GcTest();

	}
	
	void start() {  
	    /*A a = new A(); 
	    B b = new B(); 
	    a.s(b);  
	    b = null;  Line 5 
	    a = null;   Line 6 */
	    System.out.println("start completed"); /* Line 7 */
	} 
}

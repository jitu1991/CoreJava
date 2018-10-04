package com.test.java;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String char1 = "You have been warned";
		
		StringBuffer char2 = new StringBuffer("Tiny House");
		
		char2.replace(0, 1, "xxx");
		System.out.println(char2);
		

	}
	
	public String replace() {
		return "";
	}
	
	static void swap(Person p11, Person p21){
		Person temp =p11;
		p11=p21;
		p21=temp;
	}


}

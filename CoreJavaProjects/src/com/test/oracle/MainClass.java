package com.test.oracle;
class TopClass {
	TopClass() {
		System.out.println("inside top class constructor");
	}
	
	static {
		System.out.println("inside static of parent class");
	}
}

class SubClass extends TopClass {
	SubClass() {
		System.out.println("inside subclass construct");
	}
	
	static {
		//TopClass tc = new TopClass();
		//new Thread(tc).start();
		System.out.println("inside static block");
	}
}
public class MainClass {

	public static void main(String[] args) {
		SubClass sb = new SubClass();
	}

}

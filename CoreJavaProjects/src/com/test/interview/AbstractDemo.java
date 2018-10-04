package com.test.interview;

interface TempInterface {
	public void sayIt();
}

abstract class Temp implements TempInterface {
	
	public Temp(){
		System.out.println("Inside No args constructor of abstract");
	}
	
	
	public Temp(String str) {
		System.out.println("Inside String constructor of abstract");
	}
	
	public abstract void Display();
	
	public void print() {
		System.out.println("Inside print of abstract class");
	}
}

public class AbstractDemo extends Temp {
	public AbstractDemo() {
		System.out.println("Inside default constructor of main");
	}
	
	public static void StaticMethod() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		//Temp.StaticMethod();
		Temp t = new Temp() {
			
			@Override
			public void Display() {
				System.out.println("Inside anonymous inner class of abstract");
			}

			public void sayIt() {
			}
		};
		t.Display();
		
		Temp t1 = new AbstractDemo();
		StaticMethod();
		t1.Display();
		t1.print();
	} 

	@Override
	public void Display() {
		System.out.println("Inside display of main class");
	}

	public void print() {
		System.out.println("Inside print of main class");
	}

	public void sayIt() {
		// TODO Auto-generated method stub
	}
}

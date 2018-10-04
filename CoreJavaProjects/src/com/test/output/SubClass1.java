package com.test.output;

public class SubClass1 extends SuperClass1 {

	private SubClass1() {
		System.out.print("sub ");
	}

	public static void main(String[] args) {
		new SuperClass1();
		class InnerClass {

			private InnerClass() {
				System.out.print("inner ");
			}
			{
				new SubClass1();
			}
			{
				new SuperClass1();
			}
		}
		new InnerClass();
	}

}
package com.test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import javax.swing.tree.FixedHeightLayoutCache;

class TestException extends Exception {
	public void Trace() {
		System.out.println("TestException Occured");
	}
}

class AAA {
	String sayHello(String name) throws Exception {
		return "Hello " + name;
	}
}

class AA1 {
	void method1() {
		BB1 b1 = new BB1();
		b1.method2();
	}
}

class BB1 {
	void method2() {
		CC1 c1 = new CC1();
		try {
			c1.method3();
		} catch (TestException e) {
			e.Trace();
		}
	}
}

class CC1 {
	void method3() throws TestException {
		throw new TestException();
	}
}

class Airplane {
	Airplane() {
		System.out.println("Airplane Constructor");
	}
}

class Airjet extends Airplane {
	Airjet() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}
}

/*interface AbstractInterface {
	public abstract void m1();
	void m2();
	public void m3();
	abstract void m4();
}

class Sample implements AbstractInterface {
	public void m1() {
		
	}
	void m2() {
		
	}
}*/

public class InterviewQues {
	public static void main(String[] args) {
		int[] x = {1,2,3};
		int[] y= x;
		System.out.println(y[2]);
		
		/*System.out.println(0.0/4.5);//	0.0
		System.out.println(4.5/0.0);//	Infinity
		System.out.println(0.0/0.0);//	NaN
		System.out.println(5/0);//	java.lang.ArithmeticExceptio
		try {
			System.out.println("Hello"+1/0);
		}
		finally {
			System.out.println("Inside finally");
		}*/
		
		/*AAA a = new AAA();
		a.sayHello("Evan");*/
		
		/*try {
			AA1 a1 = new AA1();
			a1.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*long[] a1 = {3,4,5};
		long[] a2 = fix(a1);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1==a2);*/
		
		/*try {
			new Airjet();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*InterviewQues.test(null);*/
		
		/*TreeSet<Integer> intSet = new TreeSet<>();
		
		for(int i = 608; i <= 619; i++) {
			if(i%2==0) {
				intSet.add(i);
			}
		}
		
		TreeSet<Integer> subIntSet = (TreeSet<Integer>) intSet.subSet(608, true, 615, true);
		subIntSet.add(617);
		System.out.println(intSet);
		System.out.println(subIntSet);*/
		
		/*Integer int1 = 5;*/
		
		/*ArrayList<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(0, 11);
		System.out.println(intList.size());*/
		
		/*ArrayList<Object> intList = new ArrayList<>();
		intList.add(5);
		intList.add(6);
		intList.add("Seven");
		intList.add(1, "Six");
		intList.add(new Integer(13));
		intList.add(new ArrayList<>(Arrays.asList("A", "B",1)));
		System.out.println(intList);*/
	}
	
	static void test(String str) {
		System.out.println("Inside String");
	}
	
	static void test(int i) {
		System.out.println("Inside Integer");
	}
	
	static void test(float x) {
		System.out.println("float");
	}
	static void test(double x) {
		System.out.println("double");
	}
	
	static long[] fix(long[] a) {
		a[1] = 7;
		return a;
	}
}

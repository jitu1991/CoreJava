package com.test.indiabix.javaclass;

public class Test178 {
	public static void main(String[] args) {
		String s = "foo";
		Object o = (Object) s;
		
		System.out.println(s.hashCode());
		System.out.println(o.hashCode());
		if (s.equals(o)) {
			System.out.print("AAA");
		} else {
			System.out.print("BBB");
		}
		if (o.equals(s)) {
			System.out.print("CCC");
		} else {
			System.out.print("DDD");
		}
	}

}

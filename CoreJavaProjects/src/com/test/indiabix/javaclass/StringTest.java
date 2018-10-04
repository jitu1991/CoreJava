package com.test.indiabix.javaclass;

public class StringTest {
	public static void main(String[] args) {
		/*String aa = "abc";
		String bb = "abc";
		String cc = new String("abc");
		String dd = new String("abc");
		
		System.out.println(aa==bb);
		System.out.println(aa.equals(bb));
			
		System.out.println(aa==cc);
		System.out.println(aa.equals(cc));
		
		System.out.println(cc==dd);
		System.out.println(cc.equals(dd));*/

		String x = new String("xyz");
		String x1 = "xyz";
		String x2 = new String("xyz");
		String x3 = new String(x1);
		//System.out.println(x.hashCode());
		//System.out.println(new String("xyz").hashCode());
		
		System.out.println(x1=="xyz");
		System.out.println(x==x1);
		System.out.println(x1==x2.intern());
		System.out.println(x==x2);
		System.out.println(x3==x1);
		
		String c1 = x;
		String y = "abc";
		String c = "xyzabc";
		x = x + y;
		//System.out.println(c1==x);
	}

}

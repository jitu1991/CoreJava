package com.test.interview;

public class ChildUtil {
	public static void main(String[] args) {
		new ChildUtil().callStuff();
	}

	void callStuff() {
		//System.out.print("this " + this.doStuff()); /* Line 18 */
		ParentUtil p = new ParentUtil();
		System.out.print(" parent " + p.doStuff()); /* Line 20 */
	}
}

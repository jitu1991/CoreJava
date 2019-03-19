package com.test.misc;
interface t1 {
	
}

interface t2 {
	
}

class intTest implements t1 {
	
}

public class StartsWithTest {
	public static void main(String[] args) {
		/*String path = "My Do3c|Test";
		if (path.startsWith("My Doc")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		t1 t1test = new intTest();
		intTest tt = (intTest) t1test;
		System.out.println(tt);*/
		
		String myPath = "My";
		String path = "My/Test/xxx";
		//System.out.println(path.substring(myPath.length()));
		//System.out.println(path.replaceAll("\\.", "|"));
		/*StringBuilder substring = new StringBuilder(path.substring(myPath.length()));
		if(substring.charAt(0) == '|') {
			substring.deleteCharAt(0);
		}
		System.out.println(substring);*/
		System.out.println(path.replaceAll("/", "|"));
	}
}

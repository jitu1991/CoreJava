package com.test.misc;

public final class ImmutableClassTest {

	public static void main(String[] args) {
		String alex = "alex";
		String alex1 = alex + "a";
		//System.out.println(alex);
		
		Integer aa = 3;
		Integer bb = aa + 6;
		//System.out.println(aa);
		
		Age age = new Age();
		age.setDay(1);
		age.setMonth(3);
		age.setYear(1998);
		
		ImmutableStudent student = new ImmutableStudent(1, "Alex", age);
		System.out.println("Alex age before modification: "+ student.getAge().getYear());
		student.getAge().setYear(2005);
		System.out.println("Alex age after modification: "+ student.getAge().getYear());
	}

}

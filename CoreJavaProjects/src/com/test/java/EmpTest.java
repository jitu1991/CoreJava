package com.test.java;

import java.util.*;
import java.util.stream.Collectors;

public class EmpTest {
	
	public static void main(String[] args) {
		Employee empOne = new Employee(100, "A");
		Employee empTwo = new Employee(101, "B");
		Employee empThree = new Employee(102, "C");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(empOne);
		empList.add(empTwo);
		empList.add(empThree);

		Map<Integer, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getId));
		String s = "It was a tough interview";
		String max = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");


		Employee e1 = empList.get(0);
		e1 = null;
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		
	}
	

}

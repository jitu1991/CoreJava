package com.test.output;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Employee> empTreeSet = new TreeSet<Employee>(new EmployeeComparator());

		Employee emp1 = new Employee(20, "Clark");
		Employee emp2 = new Employee(24, "Bernie");
		Employee emp3 = new Employee(3, "Alex");

		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);

		for (Employee emp : empTreeSet)
			System.out.print(emp.name + " ");

	}

}
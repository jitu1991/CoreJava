package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	public String name;
	public int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}



public class Test2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Abc",123);
		Employee emp2 = new Employee("Bba",876);
		Employee emp3 = new Employee("Abc",11);
		Employee emp4 = new Employee("Stu",543);

		List<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);

		emps.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).collect()
		Collections.sort(emps, Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));

		System.out.println(emps);

	}
}
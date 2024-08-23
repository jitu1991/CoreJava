package com.test.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id;
    public String name;

    /*@Override
    public boolean equals(Object o) {
        return true;
    }*/

    @Override
    public int hashCode() {
        return 1;
    }
}
public class HashCodeEqualsTest {

    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();

        Employee emp1 = new Employee(1,"A");
        Employee emp2 = new Employee(2,"B");
        Employee emp3 = new Employee(3,"C");

        map.put(emp1, "1");
        map.put(emp2, "2");
        map.put(emp3, "3");

        System.out.println(map.get(emp2));
    }
}

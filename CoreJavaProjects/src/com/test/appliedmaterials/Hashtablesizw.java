package com.test.appliedmaterials;

import java.util.Hashtable;

public class Hashtablesizw {

	public static void main(String[] args) {
		Hashtable obj = new Hashtable<>();
		obj.put("a", new Integer(2));
		obj.put("b", new Integer(1));
		obj.put("c", new Integer(3));
		System.out.println(obj.size());
		obj.clear();
		System.out.println(obj.size());
	}
}

package com.test.serialization;

import java.io.IOException;

public class SerializationTest {
	
	
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee();
		emp.setEmpId(100);
		emp.setEmpName("Pankaj");
		emp.setSalary(10000);
		
		String fileName = "d:\\emp.txt";
		
		/*try {
			SerializationUtil.serialize(emp, fileName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
		Employee empNew = null;
		
		try {
			empNew = (Employee)SerializationUtil.deSerialize(fileName);
		} catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(emp);
		System.out.println(empNew);
	}
}

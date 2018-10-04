package com.test.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.EmployeeDao;
import com.test.dao.JdbcEmployeeDao;
import com.test.model.Employee;

public class ClientJdbc {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDaoImpl");
		Employee employee1 = new Employee(456, "def", 888);
		employeeDao.insert(employee1);

		Employee employee2 = employeeDao.findById(456);
		System.out.println(employee2);
		
		context.close();
	}
}

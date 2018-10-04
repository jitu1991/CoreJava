package com.test.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.EmployeeDao;
import com.test.dao.JdbcEmployeeDao;
import com.test.model.Employee;

public class ClientSpringJdbc {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		JdbcEmployeeDao jdbcEmployeeDao = (JdbcEmployeeDao) context.getBean("jdbcEmployeeDaoImpl");
		Employee employee1 = new Employee(789, "qqq", 102);
		//jdbcEmployeeDao.insert(employee1);

		Employee emp = jdbcEmployeeDao.findById(3);
		System.out.println(emp);
		context.close();
	}
}

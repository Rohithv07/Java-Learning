package com.rohith.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rohith.spring.springjdbc.employee.dao.EmployeeDao;
import com.rohith.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springjdbc/employee/test/config.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		/*Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstName("Rahul");
		employee.setLastName("jj");
		*/
		// int result = employeeDao.create(employee);
		// int result = employeeDao.update(employee);
		// int result = employeeDao.delete(1);
		//Employee employee = employeeDao.read(2);
		List<Employee> result = employeeDao.read();
		System.out.println("Records records are : " + result);
	}

}

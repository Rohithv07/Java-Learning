package com.app.driver;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.EmployeeDAO;

public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO employee = (EmployeeDAO) context.getBean("employee");
		System.out.println(employee);
 
 
		
	}
}
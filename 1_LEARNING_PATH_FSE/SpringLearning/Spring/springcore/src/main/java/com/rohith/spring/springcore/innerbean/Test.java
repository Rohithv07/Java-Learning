package com.rohith.spring.springcore.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcore/innerbean/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

	/*
	 * To configure scope : inside the bean tag give scope = "singleton"(only single
	 * object created) or scope = "prototype"(different objects will be created)
	 */

}

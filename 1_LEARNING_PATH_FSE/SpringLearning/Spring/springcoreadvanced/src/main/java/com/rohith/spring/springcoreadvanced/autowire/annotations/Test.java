package com.rohith.spring.springcoreadvanced.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcoreadvanced/autowire/annotations/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

}

// use annotations @Autowired at setter method and in xml add <context:annotation-config/>


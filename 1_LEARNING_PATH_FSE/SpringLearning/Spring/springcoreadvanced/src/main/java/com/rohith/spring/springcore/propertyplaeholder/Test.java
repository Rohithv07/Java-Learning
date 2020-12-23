package com.rohith.spring.springcore.propertyplaeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rohith/spring/springcore/propertyplaeholder/config.xml");
		MyDAO myDao = (MyDAO) context.getBean("mydao");
		System.out.println(myDao);
	}

}

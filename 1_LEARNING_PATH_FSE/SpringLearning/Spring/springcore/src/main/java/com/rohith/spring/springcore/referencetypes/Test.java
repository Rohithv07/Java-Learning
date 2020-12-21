package com.rohith.spring.springcore.referencetypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcore/referencetypes/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}

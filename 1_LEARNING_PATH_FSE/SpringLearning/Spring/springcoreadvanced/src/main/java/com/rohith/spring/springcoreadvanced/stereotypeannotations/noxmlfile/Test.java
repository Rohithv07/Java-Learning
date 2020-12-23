package com.rohith.spring.springcoreadvanced.stereotypeannotations.noxmlfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcoreadvanced/stereotypeannotations/noxmlfile/config.xml");
		Instructor instructor = (Instructor) context.getBean("instructor");
		System.out.println(instructor);

	}

}

// if we need to change the name of the bean try @Component("name") and this name will be the new bean name
// here we alos injected collection types


// Spring Expression Language
// @Value("#{T(java.lang.Math).abs(-99)})  -> Method to apply static method Syntax T(class).method(parameter)
// @Value("#{new Integer(88)}) -> access the constructor
// @Value("#{'String must be in single quote'}") -> to inject the string 
// @Value("#{2 + 4 > 5}") -> assign boolean value
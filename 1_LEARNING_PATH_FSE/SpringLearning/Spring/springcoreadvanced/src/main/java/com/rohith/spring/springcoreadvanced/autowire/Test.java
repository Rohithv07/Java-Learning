package com.rohith.spring.springcoreadvanced.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcoreadvanced/autowire/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

}

// byType uses setter injection - looks the reference finds the type, instantiate and inject.
// byName uses setter injection - search the dependency, takes the name and search for the same reference name.
// byConstructor uses constructor injection
// autowire = "byType"
// autowire = "byName"
// autowire = "constructor". These are the instructions to be given inside the config.xml

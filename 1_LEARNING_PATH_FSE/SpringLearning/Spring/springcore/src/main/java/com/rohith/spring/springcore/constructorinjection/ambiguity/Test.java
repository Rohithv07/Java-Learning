package com.rohith.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rohith/spring/springcore/constructorinjection/ambiguity/config.xml");
		Addition addition = (Addition) context.getBean("addition");
		System.out.println(addition);
		
		// if i give the int parameter constructor before double, it shows inside int
		// if i reorder and double parameter constructor first, it shows inside double
		// if i make new constructor with string type, it shows inside string
		// this is the ambiguity problem with constructor.
		// container first check for the string first, then it check for other constructor in order.
		// this can be fixed using type, index, name.
		// <constructor-arg value="10" type = "int" /> this is the syntax of using type in xml
		// <constructor-arg value="10" type="int" index = "1" /> this is the syntax of using index inside xml.(To pass the arguments in right order)
	}

}

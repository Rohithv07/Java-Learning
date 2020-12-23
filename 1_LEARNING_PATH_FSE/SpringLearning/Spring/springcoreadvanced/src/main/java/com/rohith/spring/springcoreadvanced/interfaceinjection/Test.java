package com.rohith.spring.springcoreadvanced.interfaceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcoreadvanced/interfaceinjection/config.xml");
		OrderBO orderBo  = (OrderBO) context.getBean("orderbo");
		orderBo.placeOrder();

	}

}



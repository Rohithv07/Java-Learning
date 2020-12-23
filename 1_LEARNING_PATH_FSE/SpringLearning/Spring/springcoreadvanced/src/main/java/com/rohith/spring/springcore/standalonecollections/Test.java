package com.rohith.spring.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcore/standalonecollections/config.xml");
		ProductList productList = (ProductList) context.getBean("productlist");
		System.out.println(productList);

	}

}



package com.rohith.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcore/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) context.getBean("car");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		System.out.println(cardealer.getModels().getClass());
	}

}

package com.rohith.spring.springcoreadvanced.interfaceinjection.annotations;

import org.springframework.stereotype.Component;

@Component("orderdao")
public class OrderDAOImp implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("Inside create dao");
	}
	
}

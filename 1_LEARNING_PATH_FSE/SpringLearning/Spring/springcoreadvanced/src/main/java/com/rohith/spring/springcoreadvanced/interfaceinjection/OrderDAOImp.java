package com.rohith.spring.springcoreadvanced.interfaceinjection;

public class OrderDAOImp implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("Inside create dao");
	}
	
}

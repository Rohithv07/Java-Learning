package com.rohith.spring.springcoreadvanced.interfaceinjection;

public class OrderDAOImp2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside create order 2");
	}

}

package com.rohith.spring.springcoreadvanced.interfaceinjection.annotations;

import org.springframework.stereotype.Component;

@Component("orderdao2")
public class OrderDAOImp2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside create order 2");
	}

}

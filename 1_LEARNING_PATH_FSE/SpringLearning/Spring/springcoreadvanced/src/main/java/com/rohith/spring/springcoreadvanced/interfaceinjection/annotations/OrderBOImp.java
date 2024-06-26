package com.rohith.spring.springcoreadvanced.interfaceinjection.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderbo")
public class OrderBOImp implements OrderBO{
	
	@Autowired
	@Qualifier("orderdao2")
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside order bo");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}


}

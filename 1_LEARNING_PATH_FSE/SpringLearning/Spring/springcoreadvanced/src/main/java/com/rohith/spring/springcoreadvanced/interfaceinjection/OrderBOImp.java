package com.rohith.spring.springcoreadvanced.interfaceinjection;

public class OrderBOImp implements OrderBO{
	
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

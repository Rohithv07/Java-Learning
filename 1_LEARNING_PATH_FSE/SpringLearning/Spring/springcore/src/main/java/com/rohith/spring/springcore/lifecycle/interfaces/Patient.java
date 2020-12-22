package com.rohith.spring.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Iam first the setter method");
		this.id = id;
	}

	public void init() {
		System.out.println("Inside init method");
	}

	// we need to use a hook to show this in output
	public void destroY() {
		System.out.println("Inside destroY method");
	}
	
	public String toString() {
		return "Patient [id = " + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside after properties set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy");
	}
}

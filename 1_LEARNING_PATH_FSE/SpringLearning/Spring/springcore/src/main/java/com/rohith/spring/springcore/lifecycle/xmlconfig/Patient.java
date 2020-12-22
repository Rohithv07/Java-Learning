package com.rohith.spring.springcore.lifecycle.xmlconfig;

public class Patient {
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
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	public String toString() {
		return "Patient [id = " + id + "]";
	}
}

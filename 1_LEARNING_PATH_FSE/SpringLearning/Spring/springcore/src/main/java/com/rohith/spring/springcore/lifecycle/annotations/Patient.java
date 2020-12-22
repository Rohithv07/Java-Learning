package com.rohith.spring.springcore.lifecycle.annotations;



public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Iam first the setter method");
		this.id = id;
	}
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}

	// we need to use a hook to show this in output
	@PreDestroy
	public void destroY() {
		System.out.println("Inside destroY method");
	}

	public String toString() {
		return "Patient [id = " + id + "]";
	}

}

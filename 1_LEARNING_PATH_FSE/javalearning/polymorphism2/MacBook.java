package com.rohith.javalearning.polymorphism2;

public class MacBook implements AppleLaptop {

	@Override
	public void start() {
		System.out.println("Inside macbooks start");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside macbooks shutdown");
	}
	
	void anotherMethod() {
		System.out.println("Another");
	}

}

package com.rohith.javalearning.interface2;

public class Honda implements Car {
	@Override
	public void go() {
		System.out.println("Inside honda go");
	}

	public void stop() {
		System.out.println("inside honda stop");
	}

}

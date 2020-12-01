package com.rohith.javalearning.polymorphism2;

public class NewMacbookPro extends MacBook {
	@Override
	public void start() {
		System.out.println("New macbook start");
	}

	@Override
	public void shutdown() {
		System.out.println("New macbook shutdown");
	}

}

package com.rohith.javalearning.polymorphism2;

public class MacBookPro extends MacBook {
	@Override
	public void start() {
		System.out.println("Macbook pros start method");
	}

	@Override
	public void shutdown() {
		System.out.println("Macbook pros shutdown method");
	}
}

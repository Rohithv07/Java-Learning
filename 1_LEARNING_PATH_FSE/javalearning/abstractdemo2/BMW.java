package com.rohith.javalearning.abstractdemo2;

public abstract class BMW {
	void commonFunction() {
		System.out.println("Inside common functionality method");
	}

	abstract void accelerate();

	// we can create a main class in abstract class
	public static void main(String[] args) {
		System.out.println("main method");
	}
}

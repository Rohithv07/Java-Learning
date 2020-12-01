package com.rohith.javalearning.inhertance3;

// constructor chaining
public class SuperClass {
	int x;

	public SuperClass() {
		System.out.println("No arg constructor super class");
	}

	public SuperClass(int x) {
		this(); // default constructor
		this.x = x;
		System.out.println("Args constructor super class");
	}

}

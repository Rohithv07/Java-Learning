package com.rohith.javalearning.inhertance3;

// constructor chaining
public class ChildClass extends SuperClass {
	ChildClass() {
		this(10); // default constructor
		System.out.println("No args child class constructor");
	}

	ChildClass(int x) {
		super(x);
		System.out.println("Args child class Construcotr");

	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass(); // here constructor chaining happens
	}

}

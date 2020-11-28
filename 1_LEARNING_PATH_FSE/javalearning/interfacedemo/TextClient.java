package com.rohith.javalearning.interfacedemo;

public class TextClient {
	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
		// A a = new A(); // gives compilation error as interface can't be
		// instantiated
		// interface can be only reference type not object type
		A a = new X();
		C c = new X();
		a.foo();
		a.bar();
		c.foobar();
	}
}

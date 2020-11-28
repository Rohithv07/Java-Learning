package com.rohith.javalearning.interfacedemo;

public class X extends AbstractA implements A, C {
	public void foo() {
		System.out.println("X: foo");
	}
	public void foobar() {
		System.out.println("X: foobar");
	}

}

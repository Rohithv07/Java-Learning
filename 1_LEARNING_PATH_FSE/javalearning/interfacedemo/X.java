package com.rohith.javalearning.interfacedemo;

public class X extends AbstractA implements A, C, Cloneable {
	public void foo() {
		System.out.println("X: foo");
	}
	public void foobar() {
		System.out.println("X: foobar");
	}
	public C clone() {
		try {
			return (C) super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}

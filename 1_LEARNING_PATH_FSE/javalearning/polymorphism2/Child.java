package com.rohith.javalearning.polymorphism2;

public class Child extends Parent {
	String s = "child";
	public static void doSomething() {
		System.out.println("child");
	}

}

// if the parent method is static, then the child must also use static while
// overriding.
// same way if the parent do not have static, then child should not have static.
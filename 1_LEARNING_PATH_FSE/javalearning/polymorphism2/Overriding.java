package com.rohith.javalearning.polymorphism2;

public class Overriding {

	public static void main(String[] args) {
		Parent.doSomething();
		Child.doSomething();
		Parent p = new Parent();
		System.out.println(p.s);
		Child c = new Child();
		System.out.println(c.s);
		Parent c1 = new Child();
		System.out.println(c1.s); // prints parent as reference is from parent
									// class which have s = parent.
	}

}

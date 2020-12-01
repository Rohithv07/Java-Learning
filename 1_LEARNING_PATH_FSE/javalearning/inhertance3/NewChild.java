package com.rohith.javalearning.inhertance3;

public class NewChild extends NewParent {
	int c;
	int d;

	NewChild(int a, int b, int c, int d) {
		super(a, b); // invoke parent constructor
		this.c = c;
		this.d = d;
	}

	@Override
	void f1() {
		super.f1(); // shows the parents details
		System.out.println("Inside childs f1");
	}

	void display() {
		System.out.println("Parents a " + super.a);
		System.out.println("Parents b " + super.b);
		System.out.println("Childs c" + this.c);
		System.out.println("Childs d" + this.d);
	}

}

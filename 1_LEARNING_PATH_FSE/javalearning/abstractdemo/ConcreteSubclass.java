package com.rohith.javalearning.abstractdemo;

public class ConcreteSubclass extends AbstractSubclass {
	@Override
	void test2() {
		System.out.println("test2");
	}

	@Override
	void test3() {
		System.out.println("test3");
	}

	public static void main(String[] args) {
		ConcreteSubclass concreteSubclass = new ConcreteSubclass();
		concreteSubclass.test1();
		concreteSubclass.test2();
		concreteSubclass.test3();
		// AbstractSuperclass abstractSuperclass = new AbstractSuperclass(); //
		// gives an error as abstract class can't be instantiated
	}
}

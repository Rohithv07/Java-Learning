package com.rohith.javalearning.interface2;

public class Test {
	public static void main(String[] args) {
		Honda h = new Honda();
		h.go();
		h.stop();
	}

}


// some concepts on final
/*
 * If a class is final, then it can't be extended or inherited.
 * if a variable is final, value can't be changed.
 * if a method is final, then method can't be overridden.
 * if an object is final, then its reference can't be changed.
 * final and static can be together used in variables.
 * marker interfaces are the interfaces without any methods.
 * eg: Serializable, Cloneable.
 */
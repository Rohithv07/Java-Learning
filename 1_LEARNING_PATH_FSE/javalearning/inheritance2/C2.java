package com.rohith.javalearning.inheritance2;
import com.rohith.javalearning.inhertance.A1;

public class C2 extends A1{
	public static void main(String [] args) {
		// we can't inherit private 
		// System.out.println("privateMember: " + privateMember); // will show error
		// also the child class and the parent class must be in same package
		// System.out.println("defaultMember: " + defaultMember); // error as they are in different package
		System.out.println("protectedMember: " + protectedMember);
		System.out.println("publicMember: " + publicMember);
	}

}

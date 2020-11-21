package com.rohith.javalearning.inhertance;

public class C1 extends A1{ 
	public static void main(String [] args) {
		// inherited members are directly accessible
		System.out.println("defaultMember: " + defaultMember); // same package
		System.out.println("protectedMember: " + protectedMember);
		System.out.println("publicMember: " + publicMember);
		//System.out.println("privateMember: " + privateMember); // this will show error as private cant be inherited
		
	}

}

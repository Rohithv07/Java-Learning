package com.rohith.casestudy;

public class MicroCarDEFAULT implements CarParser {

	@Override
	public String parse() {
		System.out.println("Micro car in DEFAULT");
		return "Micro car - DEFAULT";
	}

}

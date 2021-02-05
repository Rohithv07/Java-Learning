package com.rohith.casestudy;

public class LuxuryCarDEFAULT implements CarParser {

	@Override
	public String parse() {
		System.out.println("Luxury car in DEFAULT");
		return "Luxury car - DEFAULT";
	}

}

package com.rohith.factorymethod;

/*
 * This class parse the response xmls.
 */
public class RepsonseXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing response XML.........");
		return "Response XML message";
	}

}

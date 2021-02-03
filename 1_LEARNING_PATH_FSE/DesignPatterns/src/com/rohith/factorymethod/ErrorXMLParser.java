package com.rohith.factorymethod;

/*
 * Implements xml parser interface and parse the error messages xmls
 */
public class ErrorXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing error XML........");
		return "Error XML message";
	}

}

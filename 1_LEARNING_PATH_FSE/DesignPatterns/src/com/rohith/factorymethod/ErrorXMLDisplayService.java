package com.rohith.factorymethod;

/*
 * This is a subclass of DisplayService that implements getParserMethod().
 */
public class ErrorXMLDisplayService extends DisplayService {
	@Override
	public XMLParser getParser() {
		return new ErrorXMLParser();
	}
}

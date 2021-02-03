package com.rohith.factorymethod;

/*
 * This is a subclass of DisplayService that implements getParserMethod().
 */
public class OrderXMLDisplayService extends DisplayService {

	@Override
	public XMLParser getParser() {
		return new OrderXMLParser();
	}

}

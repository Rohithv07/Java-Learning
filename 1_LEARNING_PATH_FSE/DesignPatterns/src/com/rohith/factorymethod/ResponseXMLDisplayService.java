package com.rohith.factorymethod;

/*
 * This is a subclass of DisplayService that implements getParserMethod().
 */
public class ResponseXMLDisplayService extends DisplayService {

	@Override
	public XMLParser getParser() {
		return new RepsonseXMLParser();
	}

}

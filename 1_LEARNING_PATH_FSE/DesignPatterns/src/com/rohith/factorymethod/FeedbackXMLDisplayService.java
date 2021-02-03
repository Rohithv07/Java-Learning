package com.rohith.factorymethod;

/*
 * This is a subclass of DisplayService that implements getParserMethod().
 */
public class FeedbackXMLDisplayService extends DisplayService {
	@Override
	public XMLParser getParser() {
		return new FeedbackXML();
	}
}

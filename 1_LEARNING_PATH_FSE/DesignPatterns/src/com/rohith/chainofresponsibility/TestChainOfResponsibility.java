package com.rohith.chainofresponsibility;

/*
 * This is the test class to check for the chain of responsibility
 */
public class TestChainOfResponsibility {
	public static void main(String[] args) {
		File file = null;
		Handler textHandler = new TextFileHandler("Text handler");
		Handler docHandler = new DocFileHandler("Doc handler");
		textHandler.setHandler(docHandler);
		file = new File("Abc.doc", "doc", "C:");
		textHandler.process(file);
	}
}

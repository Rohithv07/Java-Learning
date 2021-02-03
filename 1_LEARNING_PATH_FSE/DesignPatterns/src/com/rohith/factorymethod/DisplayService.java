package com.rohith.factorymethod;

/*
 * To display the parsed messages, an abstract service class is created which will be extended by service specific display classes. Here parser specific.
 */
public abstract class DisplayService {

	/*
	 * This is to dispay message to the user.
	 */
	public void display() {
		XMLParser parser = getParser();
		String msg = parser.parse();
		System.out.println(msg);
	}

	/*
	 * This is factory method implemented by subclasses to instantiate the parser
	 * object and method is used by the display method inorder to parse the xml and
	 * gets the message to display.
	 */
	protected abstract XMLParser getParser();
}

package com.rohith.spring.springcore.propertyplaeholder;

public class MyDAO {
	
	private String dbServer;
	
	MyDAO(String dbServer) {
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + "]";
	}

}

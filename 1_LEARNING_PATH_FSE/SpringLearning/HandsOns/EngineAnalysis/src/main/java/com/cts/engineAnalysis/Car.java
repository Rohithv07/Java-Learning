package com.cts.engineAnalysis;

public class Car {
	
	private String name;
	private Engine engine;
	
	public Car(String name, Engine engine) {
		this.name = name;
		this.engine = engine;
	}
	
	// Type your code here
	
	public void getReport(){
		
		System.out.println(this.name + " car with " + engine.getFuel() + " engine gives " + engine.getPerformance() + " horsepower");
		
	}

}

package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {
	
	public PetrolEngine(int torque, int rpm, String fuel) {
		super(torque, rpm, fuel);
	}

	@Override
	public int getPerformance() {
		int horsePower = (getTorque() * getRpm()) / 5252;
		return horsePower;
	}

// Type your code here
	
	

}

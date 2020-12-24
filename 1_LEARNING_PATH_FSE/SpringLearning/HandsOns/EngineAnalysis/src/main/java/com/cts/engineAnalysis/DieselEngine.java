package com.cts.engineAnalysis;

public class DieselEngine extends Engine {

	public DieselEngine(int torque, int rpm, String fuel) {
		super(torque, rpm, fuel);
	}
	@Override
	public int getPerformance() {
		int horsePower = (getTorque() * getRpm()) / 63025;
		return horsePower;
	}


	// Type your code here
	

}

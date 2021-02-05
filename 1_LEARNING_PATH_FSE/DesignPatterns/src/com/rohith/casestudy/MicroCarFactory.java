package com.rohith.casestudy;

public class MicroCarFactory implements CarFactory {

	@Override
	public CarParser buildCar(Location location) {
		switch(location) {
		case USA :
			return new MicroCarUSA();
		case DEFAULT:
			return new MicroCarDEFAULT();
		case INDIA:
			return new MicroCarINDIA();
		
		}
		return null;
	}

}

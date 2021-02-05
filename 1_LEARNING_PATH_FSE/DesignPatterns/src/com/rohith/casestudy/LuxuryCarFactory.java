package com.rohith.casestudy;

public class LuxuryCarFactory implements CarFactory{

	@Override
	public CarParser buildCar(Location location) {
		switch(location) {
		case USA :
			return new LuxuryCarUSA();
		case DEFAULT:
			return new LuxuryCarDEFAULT();
		case INDIA:
			return new LuxuryCarINDIA();
		
		}
		return null;
	}

}

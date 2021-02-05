package com.rohith.casestudy;

public class MiniCarFactory implements CarFactory {

	@Override
	public CarParser buildCar(Location location) {
		switch(location) {
		case USA :
			return new MiniCarUSA();
		case DEFAULT:
			return new MiniCarDEFAULT();
		case INDIA:
			return new MiniCarINDIA();
		
		}
		return null;
	}

}

package com.rohith.casestudy;

public final class CarFactoryProducer {
	private CarFactoryProducer() {
		throw new AssertionError();
	}

	public static CarFactory getFactory(CarType carType) {
		switch (carType) {
		case MINI:
			return new MiniCarFactory();
		case MICRO:
			return new MicroCarFactory();
		case LUXURY:
			return new LuxuryCarFactory();
		}
		return null;
	}
}

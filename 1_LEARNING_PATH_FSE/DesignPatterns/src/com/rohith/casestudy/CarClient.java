package com.rohith.casestudy;

public class CarClient {
	public static void main(String[] args) {
		CarFactory carFactory = CarFactoryProducer.getFactory(CarType.MINI);
		CarParser carParser = carFactory.buildCar(Location.USA);
		String message = "";
		message = carParser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		carFactory = CarFactoryProducer.getFactory(CarType.MINI);
		carParser = carFactory.buildCar(Location.INDIA);
		message = carParser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		carFactory = CarFactoryProducer.getFactory(CarType.MINI);
		carParser = carFactory.buildCar(Location.DEFAULT);
		message = carParser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		carFactory = CarFactoryProducer.getFactory(CarType.MICRO);
		carParser = carFactory.buildCar(Location.USA);
		message = carParser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		carFactory = CarFactoryProducer.getFactory(CarType.MICRO);
		carParser = carFactory.buildCar(Location.INDIA);
		message = carParser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		carFactory = CarFactoryProducer.getFactory(CarType.MICRO);
		carParser = carFactory.buildCar(Location.DEFAULT);
		message = carParser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		carFactory = CarFactoryProducer.getFactory(CarType.LUXURY);
		carParser = carFactory.buildCar(Location.USA);
		message = carParser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		carFactory = CarFactoryProducer.getFactory(CarType.LUXURY);
		carParser = carFactory.buildCar(Location.INDIA);
		message = carParser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		carFactory = CarFactoryProducer.getFactory(CarType.LUXURY);
		carParser = carFactory.buildCar(Location.DEFAULT);
		message = carParser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

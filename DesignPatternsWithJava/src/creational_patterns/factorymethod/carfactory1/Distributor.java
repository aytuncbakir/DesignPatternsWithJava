package creational_patterns.factorymethod.carfactory1;

import creational_patterns.abstractfactory.Car;

public class Distributor {
	
	public static void main(String... args) {
		System.out.println("********************************");
		Car car = CarFactory.createCar("Wolkswagen");
		car.start();
		car.stop();
		System.out.println("********************************");
		car = CarFactory.createCar("Skoda");
		car.start();
		car.stop();
		System.out.println("********************************");
	}

}

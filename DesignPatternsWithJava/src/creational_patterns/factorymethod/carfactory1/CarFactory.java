package creational_patterns.factorymethod.carfactory1;

import creational_patterns.abstractfactory.Car;
import creational_patterns.abstractfactory.Skoda;
import creational_patterns.abstractfactory.Wolkswagen;

public class CarFactory {
	
	public static Car createCar(String branch) {
		if (branch.equalsIgnoreCase("Wolkswagen")) {
			System.out.println(branch + " is created");
			return new Wolkswagen(branch);
		} else if (branch.equalsIgnoreCase("Skoda")) {
			System.out.println(branch + " is created");
			return new Skoda(branch);
		}else {
			System.out.println(branch + " undefined branch");
			return null;
		}
	}

}

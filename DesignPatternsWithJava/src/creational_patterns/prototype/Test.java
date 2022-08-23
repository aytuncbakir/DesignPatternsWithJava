package creational_patterns.prototype;

public class Test {

	public static void main(String[] args) {
		
		Car car = Car.createStandartCar("Fiat", 2020, "Standart");
		System.out.println(car);System.out.println();
		
		car = Car.createComfortCar("Wolkswagen", 2021, "Comfort");
		System.out.println(car);System.out.println();
		
		car = Car.createPremiumCar("Mercedes", 2022, "Premium");
		System.out.println(car);System.out.println();
	}

}

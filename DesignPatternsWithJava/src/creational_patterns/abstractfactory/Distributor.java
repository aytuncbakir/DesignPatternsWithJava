package creational_patterns.abstractfactory;

public class Distributor {
	
	public static void main(String... args) {
		
		WolkswagenFactory wolkswagenFactory = new WolkswagenFactory();
		Car car = wolkswagenFactory.createCar();
		
		car.start();
		car.stop();
		
		System.out.println();
		
		SkodaFactory skodaFactory = new SkodaFactory();
		car = skodaFactory.createCar();
		
		car.start();
		car.stop();
	}

}

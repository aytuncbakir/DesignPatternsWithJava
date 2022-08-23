package creational_patterns.factorymethod.carfactory2;

public class Distributor {
	
	public static void main(String... args) {
		System.out.println("********************************");
		Car car = CarFactory.createWolkswagen();
		car.start();
		car.stop();
		System.out.println("********************************");
		car = CarFactory.createSkoda();
		car.start();
		car.stop();
		System.out.println("********************************");
	}

}

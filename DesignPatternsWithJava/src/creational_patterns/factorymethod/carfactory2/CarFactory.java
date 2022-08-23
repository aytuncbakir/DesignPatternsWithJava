package creational_patterns.factorymethod.carfactory2;

public class CarFactory {
	
	public static Car createWolkswagen() {
		System.out.println("Wolkswagen is created");
		return new Wolkswagen("Wolkswagen");
	}
	
	public static Car createSkoda() {
			System.out.println("Skoda is created");
			return new Skoda("Skoda");
		
	}

}

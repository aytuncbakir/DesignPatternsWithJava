package creational_patterns.abstractfactory;

public class WolkswagenFactory implements CarFactory{

	@Override
	public Car createCar() {
		System.out.println("Wolkswagen is created.");
		return new Wolkswagen("Wolkswagen");
	}

}

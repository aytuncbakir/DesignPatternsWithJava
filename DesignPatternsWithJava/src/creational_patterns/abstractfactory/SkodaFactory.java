package creational_patterns.abstractfactory;

public class SkodaFactory implements CarFactory{

	@Override
	public Car createCar() {
		System.out.println("Skoda is created.");
		return new Skoda("Skoda");
	}

}

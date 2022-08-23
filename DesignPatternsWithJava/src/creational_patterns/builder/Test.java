package creational_patterns.builder;

public class Test {

	public static void main(String[] args) {
		Car car = CarBuilder.getBuilder()
				.setModel("Car1")
				.setAccumulator(new Accumulator("Accumulator1"))
				.setBrake(new Brake("Brake1"))
				.setDoor(new Door("Door1"))
				.setEngine(new Engine("Engine1"))
				.setTire(new Tire("Tire1"))
				.build();
		
		
		System.out.println(car);
		
		
		car = CarBuilder.buildStandartCar("Car2",new Engine("Engine2"), new Door("Door2"), new Accumulator("Accumulator2"),
				new Seat("Seat2"), new Wheel("Wheel2"))
				.setClimate(new Climate("Climate2"))
				.setSafetyBelt(new SafetyBelt("SafetyBelt2"))
				.build();
		
		System.out.println(car);
		
		car = CarBuilder.buildComfortCar("Car3",new Engine("Engine3"), new Door("Door3"), new Accumulator("Accumulator3"),
				new Seat("Seat3"), new Wheel("Wheel3"), new Climate("Climate3"), new Accessorries("Accessorries"))
				.setSafetyBelt(new SafetyBelt("SafetyBelt3"))
				.build();
		
		System.out.println(car);
		
	}

}

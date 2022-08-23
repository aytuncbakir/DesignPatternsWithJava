package creational_patterns.builder;

public class CarBuilder {

	private String model;
	private Accessorries accessorries;
	private Accumulator accumulator;
	private Brake brake;
	private Climate climate;
	private Door door;
	private Engine engine ;
	private GasTank gasTank;
	private SafetyBelt safetyBelt;
	private Seat seat;
	private Tire tire;
	private Transmission transmission;
	private Wheel wheel;
	private WindScreen windScreen;
	private Wiper wiper;
	
	public Car build() {
		Car car = new Car();
		
		car.setAccessorries(accessorries);
		car.setAccumulator(accumulator);
		car.setBrake(brake);
		car.setClimate(climate);
		car.setDoor(door);
		car.setEngine(engine);
		car.setGasTank(gasTank);
		car.setModel(model);
		car.setSafetyBelt(safetyBelt);
		car.setSeat(seat);
		car.setTire(tire);
		car.setTransmission(transmission);
		car.setWheel(wheel);
		car.setWindScreen(windScreen);
		car.setWiper(wiper);
		
		return car;
	}
	
	// you can force to insert some properties
	 public static CarBuilder buildStandartCar(String model, Engine engine, Door door, Accumulator accumulator, 
			 Seat seat, Wheel wheel){

		 	CarBuilder carBuilder = new CarBuilder();
		 	carBuilder.setModel(model);
		 	carBuilder.setEngine(engine);
		 	carBuilder.setDoor(door);
		 	carBuilder.setAccumulator(accumulator);
			carBuilder.setSeat(seat);
			carBuilder.setWheel(wheel);

	        return carBuilder;
	    }

		// you can force to insert some properties
	 public static CarBuilder buildComfortCar(String model, Engine engine, Door door, Accumulator accumulator,
				Seat seat, Wheel wheel, Climate climate, Accessorries accessorries) {

			CarBuilder carBuilder = new CarBuilder();
			carBuilder.setModel(model);
			carBuilder.setEngine(engine);
			carBuilder.setDoor(door);
			carBuilder.setAccumulator(accumulator);
			carBuilder.setSeat(seat);
			carBuilder.setWheel(wheel);
			carBuilder.setClimate(climate);
			carBuilder.setAccessorries(accessorries);

			return carBuilder;
		}

	public static CarBuilder getBuilder() {
		return new CarBuilder();
	}

	public CarBuilder setModel(String model) {
		this.model = model;
		return this;
	}

	public CarBuilder setAccessorries(Accessorries accessorries) {
		this.accessorries = accessorries;
		return this;
	}

	public CarBuilder setAccumulator(Accumulator accumulator) {
		this.accumulator = accumulator;
		return this;
	}

	public CarBuilder setBrake(Brake brake) {
		this.brake = brake;
		return this;
	}

	public CarBuilder setClimate(Climate climate) {
		this.climate = climate;
		return this;
	}

	public CarBuilder setDoor(Door door) {
		this.door = door;
		return this;
	}

	public CarBuilder setEngine(Engine engine) {
		this.engine = engine;
		return this;
	}

	public CarBuilder setGasTank(GasTank gasTank) {
		this.gasTank = gasTank;
		return this;
	}

	public CarBuilder setSafetyBelt(SafetyBelt safetyBelt) {
		this.safetyBelt = safetyBelt;
		return this;
	}

	public CarBuilder setSeat(Seat seat) {
		this.seat = seat;
		return this;
	}

	public CarBuilder setTire(Tire tire) {
		this.tire = tire;
		return this;
	}

	public CarBuilder setTransmission(Transmission transmission) {
		this.transmission = transmission;
		return this;
	}

	public CarBuilder setWheel(Wheel wheel) {
		this.wheel = wheel;
		return this;
	}

	public CarBuilder setWindScreen(WindScreen windScreen) {
		this.windScreen = windScreen;
		return this;
	}

	public CarBuilder setWiper(Wiper wiper) {
		this.wiper = wiper;
		return this;
	}
	
	
}

package creational_patterns.builder;

public class Car {

	private String model;
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
	private Accessorries accessorries;
	
	
	// telescobic constructor
	public Car(String model,Accessorries accessorries, Accumulator accumulator, Brake brake, Climate climate, Door door, Engine engine,
			GasTank gasTank, SafetyBelt safetyBelt, Seat seat, Tire tire, Transmission transmission, Wheel wheel,
			WindScreen windScreen, Wiper wiper) {
		super();
		this.model = model;
		this.accessorries = accessorries;
		this.accumulator = accumulator;
		this.brake = brake;
		this.climate = climate;
		this.door = door;
		this.engine = engine;
		this.gasTank = gasTank;
		this.safetyBelt = safetyBelt;
		this.seat = seat;
		this.tire = tire;
		this.transmission = transmission;
		this.wheel = wheel;
		this.windScreen = windScreen;
		this.wiper = wiper;
	}
	public Car() {
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Accessorries getAccessorries() {
		return accessorries;
	}
	public void setAccessorries(Accessorries accessorries) {
		this.accessorries = accessorries;
	}
	public Accumulator getAccumulator() {
		return accumulator;
	}
	public void setAccumulator(Accumulator accumulator) {
		this.accumulator = accumulator;
	}
	public Brake getBrake() {
		return brake;
	}
	public void setBrake(Brake brake) {
		this.brake = brake;
	}
	public Climate getClimate() {
		return climate;
	}
	public void setClimate(Climate climate) {
		this.climate = climate;
	}
	public Door getDoor() {
		return door;
	}
	public void setDoor(Door door) {
		this.door = door;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public GasTank getGasTank() {
		return gasTank;
	}
	public void setGasTank(GasTank gasTank) {
		this.gasTank = gasTank;
	}
	public SafetyBelt getSafetyBelt() {
		return safetyBelt;
	}
	public void setSafetyBelt(SafetyBelt safetyBelt) {
		this.safetyBelt = safetyBelt;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public Transmission getTransmission() {
		return transmission;
	}
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public WindScreen getWindScreen() {
		return windScreen;
	}
	public void setWindScreen(WindScreen windScreen) {
		this.windScreen = windScreen;
	}
	public Wiper getWiper() {
		return wiper;
	}
	public void setWiper(Wiper wiper) {
		this.wiper = wiper;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", accumulator=" + accumulator + ", brake=" + brake + ", climate=" + climate
				+ ", door=" + door + ", engine=" + engine + ", gasTank=" + gasTank + ", safetyBelt=" + safetyBelt
				+ ", seat=" + seat + ", tire=" + tire + ", transmission=" + transmission + ", wheel=" + wheel
				+ ", windScreen=" + windScreen + ", wiper=" + wiper + "]";
	}
	
	
	
}

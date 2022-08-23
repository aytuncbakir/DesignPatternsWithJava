package creational_patterns.prototype;

public class Car implements Cloneable{

	private String producer;
	private int year;
	private String model;
	private Climate climate;
	private Door door;
	private Engine engine ;
	private CarBody carBody;
	private Accessorries accessorries;
	
	// ***   Prototypes   ***
	// Standart Prototype
	private static Car standartPrototype = new Car(null, 0,null, new CarBody("Aluminum"), 
												null, null, new Door("Manuel"),new Engine("1200hp"));

	// Comfort Prototype
	private static Car comfortPrototype = new Car(null, 0,null, new CarBody("Aluminum"), 
			null, new Climate("Climate"), new Door("Automatic"),new Engine("1600hp"));

	// Premium Prototype
	private static Car premiumPrototype = new Car(null, 0,null, new CarBody("Steel"), 
			new Accessorries("Accessorries"), new Climate("Climate"), new Door("Automatic"),new Engine("2000hp"));
	
	// telescobic constructor
	public Car(String producer, int year, String model, CarBody carBody, Accessorries accessorries,  Climate climate, Door door, Engine engine) {
		super();
		this.producer = producer;
		this.year = year;
		this.model = model;
		this.carBody = carBody;
		this.accessorries = accessorries;
		this.climate = climate;
		this.door = door;
		this.engine = engine;
		
	}
	public Car() {
		
	}
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
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
	
	
	
	@Override
	public Car clone() {
		Car car = null;
		try {
			car = (Car) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Problem when cloning the object: " + e.getMessage());
			e.printStackTrace();
		}
		return car;
	}

	public static Car createStandartCar(String producer, int year, String model) {
		Car car = standartPrototype.clone();
		car.setProducer(producer);
		car.setYear(year);
		car.setModel(model);
		return car;
	}

	public static Car createComfortCar(String producer, int year, String model) {
		Car car = comfortPrototype.clone();
		car.setProducer(producer);
		car.setYear(year);
		car.setModel(model);
		return car;
	}

	public static Car createPremiumCar(String producer, int year, String model) {
		Car car = premiumPrototype.clone();
		car.setProducer(producer);
		car.setYear(year);
		car.setModel(model);
		return car;
	}
	@Override
	public String toString() {
		return "Car [\n producer=" + producer + ",\n year=" + year + ",\n model=" + model + ",\n climate=" + climate + ",\n door="
				+ door + ",\n engine=" + engine + ",\n carBody=" + carBody + ",\n accessorries=" + accessorries + "\n]";
	}
	
}

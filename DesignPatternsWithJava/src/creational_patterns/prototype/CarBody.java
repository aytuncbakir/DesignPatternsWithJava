package creational_patterns.prototype;

public class CarBody {

	private String name;

	public CarBody(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "CarBody [name=" + name + "]";
	}
}

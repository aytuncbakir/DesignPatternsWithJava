package creational_patterns.builder;

public class Tire {

	private String name;

	public Tire(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Tire [name=" + name + "]";
	}
	
}

package creational_patterns.builder;

public class Wheel {

	private String name;

	public Wheel(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Wheel [name=" + name + "]";
	}
	
}

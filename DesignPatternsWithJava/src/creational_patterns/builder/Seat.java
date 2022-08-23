package creational_patterns.builder;

public class Seat {

	private String name;

	public Seat(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Seat [name=" + name + "]";
	}
	
}

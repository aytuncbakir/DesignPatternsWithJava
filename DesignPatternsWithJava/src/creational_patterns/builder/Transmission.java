package creational_patterns.builder;

public class Transmission {

	private String name;

	public Transmission(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Transmission [name=" + name + "]";
	}
	
}

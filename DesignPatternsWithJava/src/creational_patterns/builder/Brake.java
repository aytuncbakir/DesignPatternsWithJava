package creational_patterns.builder;

public class Brake {

	private String name;

	public Brake(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Brake [name=" + name + "]";
	}
	
}

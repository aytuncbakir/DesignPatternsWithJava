package creational_patterns.builder;

public class Engine {

	private String name;

	public Engine(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Engine [name=" + name + "]";
	}
	
}

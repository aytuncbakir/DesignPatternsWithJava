package creational_patterns.prototype;

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

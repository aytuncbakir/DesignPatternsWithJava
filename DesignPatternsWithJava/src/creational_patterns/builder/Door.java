package creational_patterns.builder;

public class Door {

	private String name;

	public Door(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Door [name=" + name + "]";
	}
	
}

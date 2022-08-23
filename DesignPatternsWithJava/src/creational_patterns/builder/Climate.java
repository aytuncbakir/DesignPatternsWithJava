package creational_patterns.builder;

public class Climate {

	private String name;

	public Climate(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Climate [name=" + name + "]";
	}
	
}

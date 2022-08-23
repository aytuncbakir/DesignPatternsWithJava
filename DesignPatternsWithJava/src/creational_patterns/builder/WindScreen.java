package creational_patterns.builder;

public class WindScreen {

	private String name;

	public WindScreen(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "WindScreen [name=" + name + "]";
	}
	
}

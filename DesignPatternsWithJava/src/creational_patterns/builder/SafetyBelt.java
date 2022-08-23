package creational_patterns.builder;

public class SafetyBelt {

	private String name;

	public SafetyBelt(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "SafetyBelt [name=" + name + "]";
	}
	
}

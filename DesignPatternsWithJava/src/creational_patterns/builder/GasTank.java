package creational_patterns.builder;

public class GasTank {

	private String name;

	public GasTank(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "GasTank [name=" + name + "]";
	}
	
}

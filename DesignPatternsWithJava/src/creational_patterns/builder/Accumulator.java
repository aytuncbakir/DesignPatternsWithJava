package creational_patterns.builder;

public class Accumulator {
	
	private String name;

	public Accumulator(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Accumulator [name=" + name + "]";
	}
	
	

}

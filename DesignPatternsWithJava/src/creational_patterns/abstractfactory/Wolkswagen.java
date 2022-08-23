package creational_patterns.abstractfactory;

public class Wolkswagen implements Car{

	private String branch;
	
	public Wolkswagen(String model) {
		super();
		this.branch = model;
	}

	@Override
	public void start() {
		System.out.println(this.branch + " is started");
	}

	@Override
	public void stop() {
		System.out.println(this.branch + " is stopped");
	}

}

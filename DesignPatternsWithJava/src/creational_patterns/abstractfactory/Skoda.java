package creational_patterns.abstractfactory;

public class Skoda implements Car{

	private String branch; 
	
	public Skoda(String branch) {
		super();
		this.branch = branch;
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

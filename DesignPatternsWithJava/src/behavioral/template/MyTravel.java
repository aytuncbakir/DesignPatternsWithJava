package behavioral.template;

public class MyTravel extends Travel{
	
	

	public MyTravel(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void go() {
		System.out.println("I will go to travel by my car.");
	}

	@Override
	void giveBreak() {
		System.out.println("I will give a break at Tampere.");
	}

	@Override
	void eatSometing() {
		System.out.println("I will eat smokedfish.");
	}

	@Override
	void visit() {
		System.out.println("I will visit White Church.");
	}

	@Override
	void takePhoto() {
		System.out.println("I will take photo with my phone.");
	}

}

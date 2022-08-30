package behavioral.template;

public class YourTravel extends Travel{

	public YourTravel(String name) {
		super(name);
	}
	
	@Override
	void go() {
		System.out.println("You will go to travel by bus.");
	}

	@Override
	void giveBreak() {
		System.out.println("You will give a break at Lahti.");
	}

	@Override
	void eatSometing() {
		System.out.println("You will eat pirakka.");
	}

	@Override
	void visit() {
		System.out.println("You will visit port.");
	}

	@Override
	void takePhoto() {
		System.out.println("You will take photo with camera.");
	}

}

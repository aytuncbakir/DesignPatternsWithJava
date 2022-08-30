package behavioral.template;

public class HisTravel extends Travel{

	public HisTravel(String name) {
		super(name);
	}
	
	@Override
	void go() {
		System.out.println("He will go to travel by train.");
	}

	@Override
	void giveBreak() {
		System.out.println("He will give a break at Jämsä.");
	}

	@Override
	void eatSometing() {
		System.out.println("He will eat pizza.");
	}

	@Override
	void visit() {
		System.out.println("He will visit vanha tori.");
	}

	@Override
	void takePhoto() {
		System.out.println("He will take photo with phone.");
	}

}

package behavioral.template;

public class HerTravel extends Travel{

	public HerTravel(String name) {
		super(name);
	}
	
	@Override
	void go() {
		System.out.println("He will go to travel by caravan.");
	}

	@Override
	void giveBreak() {
		System.out.println("He will give a break at Hämeenlinna.");
	}

	@Override
	void eatSometing() {
		System.out.println("He will eat sandwich.");
	}

	@Override
	void visit() {
		System.out.println("He will visit Kamppi.");
	}

	@Override
	void takePhoto() {
		System.out.println("He will take photo with camera.");
	}

}

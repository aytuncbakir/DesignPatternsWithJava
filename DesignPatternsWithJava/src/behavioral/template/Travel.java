package behavioral.template;

public abstract class Travel {
	
	private String name;

	public Travel(String name) {
		super();
		this.name = name;
	}
	
	abstract void go();
	abstract void giveBreak();
	abstract void eatSometing();
	abstract void visit();
	abstract void takePhoto();
	
	public void takeAVacation() {
		 go();
		 giveBreak();
		 eatSometing();
		 visit();
		 takePhoto();
	}

	public String getName() {
		return name;
	}
	
}

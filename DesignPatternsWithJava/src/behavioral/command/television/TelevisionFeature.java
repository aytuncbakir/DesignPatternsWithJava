package behavioral.command.television;

public abstract class TelevisionFeature {
	
	private int value;

	public TelevisionFeature(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}

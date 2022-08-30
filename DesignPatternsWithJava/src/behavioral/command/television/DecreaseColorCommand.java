package behavioral.command.television;

public class DecreaseColorCommand implements Command {
	private Television tv;
	
	public DecreaseColorCommand(Television tv) {
		this.tv = tv;
	}
	
	public void execute(TelevisionFeature color) {
		tv.decreaseColor(color);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
	}

}

package behavioral.command.television;

public class IncreaseColorCommand implements Command {
	private Television tv;
	
	public IncreaseColorCommand(Television tv) {
		this.tv = tv;
	}
	
	public void execute(TelevisionFeature color) {
		tv.increaseColor(color);
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

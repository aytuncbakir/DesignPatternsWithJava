package behavioral.command.television;

public class TurnOffCommand implements Command {
	private Television tv;
	
	public TurnOffCommand(Television tv) {
		this.tv = tv;
	}
	
	public void execute(TelevisionFeature channel) {
		tv.turnOff();
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

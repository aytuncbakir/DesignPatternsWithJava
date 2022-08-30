package behavioral.command.television;

public class TurnOnCommand implements Command {
	private Television tv;
	
	public TurnOnCommand(Television tv) {
		this.tv = tv;
	}
	
	public void execute(TelevisionFeature channel) {
		tv.turnOn(channel);
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

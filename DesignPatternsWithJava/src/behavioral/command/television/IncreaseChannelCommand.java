package behavioral.command.television;

public class IncreaseChannelCommand implements Command {
	private Television tv;
	
	public IncreaseChannelCommand(Television tv) {
		this.tv = tv;
	}
	
	public void execute(TelevisionFeature channel) {
		tv.increaseChannel(channel);
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

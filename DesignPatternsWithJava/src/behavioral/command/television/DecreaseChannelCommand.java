package behavioral.command.television;

public class DecreaseChannelCommand implements Command {
	private Television tv;
	
	public DecreaseChannelCommand(Television tv) {
		this.tv = tv;
	}
	
	public void execute(TelevisionFeature channel) {
		tv.decreaseChannel(channel);
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

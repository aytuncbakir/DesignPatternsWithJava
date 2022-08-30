package behavioral.command.television;

public class IncreaseVoiceCommand implements Command {
	private Television tv;
	
	public IncreaseVoiceCommand(Television tv) {
		this.tv = tv;
	}
	
	public void execute(TelevisionFeature channel) {
		tv.increaseVoice(channel);
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

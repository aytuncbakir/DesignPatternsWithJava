package behavioral.command.television;

public class DecreaseVoiceCommand implements Command {
	private Television tv;
	
	public DecreaseVoiceCommand(Television tv) {
		this.tv = tv;
	}
	
	public void execute(TelevisionFeature voice) {
		tv.decreaseVoice(voice);
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

package behavioral.command.television;

public class TVSwitch {
	private Television tv;
	private Command turnOnCommand;
	private Command turnOffCommand;
	private Command increaseChannelCommand;
	private Command decreaseChannelCommand;
	private Command increaseVoiceCommand;
	private Command decreaseVoiceCommand;
	private Command increaseColorCommand;
	private Command decreaseColorCommand;
	
	
	private Channel startingChannel = new Channel(1);
	private Voice startingVoice = new Voice(1);
	private Color startingColor = new Color(1);

	public TVSwitch() {
		tv = new Television(startingChannel,startingVoice,startingColor );
		turnOnCommand = new TurnOnCommand(tv);
		turnOffCommand = new TurnOffCommand(tv);
		increaseChannelCommand = new IncreaseChannelCommand(tv);
		decreaseChannelCommand = new DecreaseChannelCommand(tv);
		increaseVoiceCommand = new IncreaseVoiceCommand(tv);
		decreaseVoiceCommand = new DecreaseVoiceCommand(tv);
		increaseColorCommand = new IncreaseColorCommand(tv);
		decreaseColorCommand = new DecreaseColorCommand(tv);
		
	}
	
	public void turnOn(int channel) {
		turnOnCommand.execute(new Channel(channel));
	}
	
	public void turnOff() {
		turnOffCommand.execute(null);
	}
	
	public void decreaseChannel(int channel) {
		decreaseChannelCommand.execute(new Channel(channel));
	}
	
	public void increaseChannel(int channel) {
		increaseChannelCommand.execute(new Channel(channel));
	}
	
	public void increaseVoice(int voice) {
		increaseVoiceCommand.execute(new Voice(voice));
	}
	
	public void decreaseVoice(int voice) {
		decreaseVoiceCommand.execute(new Voice(voice));
	}
	
	public void increaseColor(int color) {
		increaseColorCommand.execute(new Color(color));
	}
	
	public void decreaseColor(int color) {
		decreaseColorCommand.execute(new Color(color));
	}
	
	
	
}

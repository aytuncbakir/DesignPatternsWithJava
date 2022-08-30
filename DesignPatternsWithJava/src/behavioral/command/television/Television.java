package behavioral.command.television;

public class Television {
	
	private int currentChannel;
	private int targetChannel;
	private int currentVoice;
	private int targetVoice;
	private int currentColor;
	private int targetColor;
	private boolean isOpen = false;

	public Television(Channel currentChannel, Voice currentVoice, Color currentColor) {
		this.currentChannel = currentChannel.getValue();
		this.currentVoice = currentVoice.getValue();
		this.currentColor = currentColor.getValue();
		
	}
	
	public void turnOn(TelevisionFeature targetChannel) {
	
		if (!isOpen) {
			isOpen = true;
			this.targetChannel = targetChannel.getValue();
			System.out.println("TV is turned on. Target channel is: " + ((Channel) targetChannel).getValue());
			if (this.targetChannel < currentChannel)
				increaseChannel(targetChannel);
			else if (this.targetChannel > currentChannel)
				decreaseChannel(targetChannel);
				
		} else
			System.out.println("\nTelevision is already on!");
			
	}

	public void turnOff() {
		
		if (isOpen) {
			System.out.println("Television is turned off.\n");
			isOpen = false;
			currentChannel = 0;
			targetChannel = 0;
		} else
			System.out.println("Television is already off!\n");
		
	}

	public void increaseChannel(TelevisionFeature targetChannel) {
		if (isOpen) {
			this.targetChannel = targetChannel.getValue();
			if (this.targetChannel > currentChannel) {
				currentChannel = this.targetChannel;
				System.out.println("Channel up is activated. Target channek is: " + ((Channel) targetChannel).getValue());
			}
		} else
			System.out.println("TV is off, please first turn it on!");
	}

	public void decreaseChannel(TelevisionFeature targetChannel) {
		if (isOpen) {
			this.targetChannel = targetChannel.getValue();
			if (this.targetChannel < currentChannel) {
				currentChannel = this.targetChannel;
				System.out.println("Channel down is activated. Target channek is: " + targetChannel.getValue());
			}
		} else
			System.out.println("TV is off, please first turn it on!");
	}
	
	public void increaseVoice(TelevisionFeature targetVoice) {
		if (isOpen) {
			this.targetVoice = targetVoice.getValue();
			if (this.targetVoice > currentVoice) {
				currentVoice = this.targetVoice;
				System.out.println("Voice up is activated. Target voice is: " + targetVoice.getValue());
			}
		} else
			System.out.println("TV is off, please first turn it on!");
	}
	
	public void decreaseVoice(TelevisionFeature targetVoice) {
		if (isOpen) {
			this.targetVoice = targetVoice.getValue();
			if (this.targetVoice < currentVoice) {
				currentVoice = this.targetVoice;
				System.out.println("Voice down is activated. Target voice is: " +  targetVoice.getValue());
			}
		} else
			System.out.println("TV is off, please first turn it on!");
	}

	public void increaseColor(TelevisionFeature targetColor) {
		if (isOpen) {
			this.targetColor = targetColor.getValue();
			if (this.targetColor > currentColor) {
				currentColor = this.targetColor;
				System.out.println("Color up is activated. Target color is: " +  targetColor.getValue());
			}
		} else
			System.out.println("TV is off, please first turn it on!");
		
	}
	
	public void decreaseColor(TelevisionFeature targetColor) {
		if (isOpen) {
			this.targetColor = targetColor.getValue();
			if (this.targetColor < currentColor) {
				currentColor = this.targetColor;
				System.out.println("Color down is activated. Target color is: " +  targetColor.getValue());
			}
		} else
			System.out.println("TV is off, please first turn it on!");
		
	}

	

}

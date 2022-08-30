package behavioral.command.television;

public class Person {

	private TVSwitch tvSwitch;
	
	public Person( TVSwitch tvSwitch) {
		this.tvSwitch = tvSwitch;
	}
	
	public static void main(String[] args) {
		TVSwitch tvSwitch = new TVSwitch();
		Person person = new Person(tvSwitch);
		person.action();
	}
	
	public void action() {
		int channel = 1;
		
		tvSwitch.turnOn(channel);
		tvSwitch.turnOff();
		
		tvSwitch.turnOn(channel);
		tvSwitch.increaseChannel(5);
		tvSwitch.decreaseChannel(3);
		tvSwitch.increaseVoice(12);
		tvSwitch.decreaseVoice(6);
		tvSwitch.increaseColor(68);
		tvSwitch.decreaseColor(45);
		tvSwitch.turnOff();
		
		tvSwitch.turnOn(1);
		tvSwitch.increaseChannel(18);
		tvSwitch.decreaseChannel(12);
		tvSwitch.decreaseChannel(11);
		tvSwitch.decreaseChannel(8);
		tvSwitch.increaseChannel(13);
		tvSwitch.increaseChannel(25);
		tvSwitch.turnOff();
	}
	
}

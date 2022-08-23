package creational_patterns.singleton;

public class Test {
	
	public static void main(String... args) {
		
		int punch = 10;
		Player player = null;
		
		for(int i = 1; i <= 10; i++) {
			player = Player.getPlayer();
		}
		
		Player.setPlayerPower(Player.getPlayerPower() - punch );
		System.out.println("Ouch " + Player.getPlayerPower());
		player.play();
	}

}

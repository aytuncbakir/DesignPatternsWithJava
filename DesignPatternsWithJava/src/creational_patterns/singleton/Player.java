package creational_patterns.singleton;

public class Player {
	
	private static int playerPower = 100;
	
	private static Player player;
	
	private static int count;
	
	private Player(int playerPower) {
		System.out.println("Player created");
	}
	
	public void play() {
		System.out.println("Lets go!");
	}
	
	public static Player getPlayer() {
		
		count++;
		System.out.println(count);
		if(player == null) {
			synchronized (Player.class) {
				if (player == null) {
					player = new Player(playerPower);
					return player;
				}
			}
		}
		return player;
	}
	
	public static int getPlayerPower() {
		return playerPower;
	}


	public static void setPlayerPower(int playerPower) {
		Player.playerPower = playerPower;
	}
	
}

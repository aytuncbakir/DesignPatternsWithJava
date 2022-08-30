package behavioral.state;

public class Game {

	private TeamState teamState;
	
	private Player player;

	public void grapBall() {
		System.out.println("--------------------------------------------------");
		System.out.println("Ball is grapped! Start the attack!");
		System.out.println("--------------------------------------------------");
		teamState = new Attack();
		player.setTeamState(teamState);
		player.start();
	}

	public void ballIsLost() {
		System.out.println("....................................................");
		System.out.println("Ball is been grapped! Start the defence");
		System.out.println("....................................................");
		teamState = new Defence();
		player.setTeamState(teamState);
		player.start();
	}
	
	public void start() {
		for(int i = 0; i < 5;i++) {
			if(i % 2 == 0) {
				grapBall();	  
			}
			else {
				ballIsLost();  
			}
				
		}
	}

	public TeamState getTeamState() {
		return teamState;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
		
	}

	
}

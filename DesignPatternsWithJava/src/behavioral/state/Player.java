package behavioral.state;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Player {

    private TeamState teamState;

    public Player() {
    }
    
    public void start() {
    	System.out.println("************************************************");
    	System.out.println("Player is Playing!");
    	play();
    	look();
    	move();
    	feint();
    	System.out.println("************************************************");
    }

    public void play(){
    	teamState.play();
    }

    public void look(){
    	teamState.look();
    }

    public void move(){
    	teamState.move();
    }

    public void feint(){
    	teamState.feint();
    }

	public TeamState getTeamState() {
		return teamState;
	}

	public void setTeamState(TeamState teamState) {
		this.teamState = teamState;
	}
    
    

}

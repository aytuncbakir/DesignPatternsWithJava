package behavioral.state;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Defence implements TeamState {

	@Override
	public void play() {
		System.out.println("Make defence!");
	}

	@Override
	public void look() {
		System.out.println("Is there any rival player on your area!");
		
	}

	@Override
	public void move() {
		System.out.println("Run to back!");
		
	}

	@Override
	public void feint() {
		System.out.println("Make a trick to take ball from rival player!");
		
	}

    
}

package behavioral.state;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Attack implements TeamState {

	@Override
	public void play() {
		System.out.println("Make attack!");
	}

	@Override
	public void look() {
		System.out.println("Is there any free teammate!");
		
	}

	@Override
	public void move() {
		System.out.println("Run to forward!");
		
	}

	@Override
	public void feint() {
		System.out.println("Make a trick to pass rival player!");
		
	}
}

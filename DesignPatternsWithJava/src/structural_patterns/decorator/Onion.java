package structural_patterns.decorator;

public class Onion extends Topping{

	public Onion(Addable addableTopping, String name, int price) {
		super(addableTopping, name, price);
	}

}

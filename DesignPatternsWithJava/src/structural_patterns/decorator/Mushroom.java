package structural_patterns.decorator;

public class Mushroom extends Topping{

	public Mushroom(Addable addableTopping, String name, int price) {
		super(addableTopping, name, price);
	}
}

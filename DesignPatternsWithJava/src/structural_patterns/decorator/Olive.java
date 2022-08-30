package structural_patterns.decorator;

public class Olive extends Topping{

	public Olive(Addable addableTopping, String name, int price) {
		super(addableTopping, name, price);
	}
}

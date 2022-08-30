package structural_patterns.decorator;

public class Cheese extends Topping{

	public Cheese(Addable addableTopping, String name, int price) {
		super(addableTopping, name, price);
	}
}

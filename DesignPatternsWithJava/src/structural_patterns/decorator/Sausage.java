package structural_patterns.decorator;

public class Sausage extends Topping{

	public Sausage(Addable addableTopping, String name, int price) {
		super(addableTopping, name, price);
	}
}

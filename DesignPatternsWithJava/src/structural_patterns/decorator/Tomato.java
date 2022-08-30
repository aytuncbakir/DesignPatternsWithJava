package structural_patterns.decorator;

public class Tomato extends Topping{

	public Tomato(Addable addableTopping, String name, int price) {
		super(addableTopping, name, price);
	}
}

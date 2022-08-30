package structural_patterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class PizzaDough implements Addable {
	private static String name;
	protected int price;
	
	public PizzaDough(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int calculatePrice() {
		return price;
	}

	@Override
	public List<Topping> getToppings() {
		return new ArrayList<Topping>();
	}
}

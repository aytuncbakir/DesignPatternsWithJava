package structural_patterns.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Topping implements Addable{
	private String name;
	protected Addable addableTopping;
	protected int price;
	
	private List<Topping> toppings = new ArrayList<>();
	
	public Topping(Addable addableTopping, String name, int price){
		this.addableTopping = addableTopping;
		toppings.add(this);
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int calculatePrice() {
		return addableTopping.calculatePrice() + price;
	}
	
	@Override
	public List<Topping> getToppings() {
		 List<Topping> toppings = addableTopping.getToppings();
		 toppings.add(this);
		 return toppings;
	}

	public String getName() {
		return name;
	}

	public Addable getAddableTopping() {
		return addableTopping;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Topping [name=" + name + ", price=" + price + "]";
	}
}

package structural_patterns.decorator;

import java.util.List;

public interface Addable {
	
	public int calculatePrice();
	
	List<Topping> getToppings();

}

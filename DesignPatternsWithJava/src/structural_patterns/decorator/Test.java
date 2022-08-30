package structural_patterns.decorator;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.makePizza1();
		test.makePizza2();
		test.makePizza3();
	}
	
	public void makePizza1(){
		System.out.println("\nPizza1 is delivered");
		Addable pizza = new PizzaDough("Pizza Dough", 3);
		System.out.println("Cost: " + pizza.calculatePrice());
		printToppings(pizza);
		pizza = new Cheese(pizza, "Cheddar cheese", 4);
		System.out.println("Cost: " + pizza.calculatePrice());
		printToppings(pizza);
		pizza = new Sausage(pizza, "Sausage", 2);
		System.out.println("Cost: " + pizza.calculatePrice());
		printToppings(pizza);
		pizza = new Tomato(pizza, "Tomato", 1);
		System.out.println("Cost: " + pizza.calculatePrice());
		printToppings(pizza);
		pizza = new Olive(pizza, "Olive", 2);
		System.out.println("Cost: " + pizza.calculatePrice());
		printToppings(pizza);
		pizza = new Mushroom(pizza, "Mushroom", 1);
		System.out.println("Cost: " + pizza.calculatePrice());
		printToppings(pizza);
	}
	
	public void makePizza2(){
		System.out.println("\nPizza2 is delivered");
		Addable pizza = new PizzaDough("Pizza Dough", 4);
		pizza = new Cheese(pizza, "Cheddar cheese", 4);
		pizza = new Sausage(pizza, "Sausage", 2);
		pizza = new Tomato(pizza, "Tomato", 1);
		pizza = new Olive(pizza, "Olive", 2);
		pizza = new Mushroom(pizza, "Mushroom", 1);
		pizza = new Onion(pizza, "Onion",1);
		System.out.println("\nCost: " + pizza.calculatePrice());
		
		printToppings(pizza);
	}
	
	public void makePizza3(){
		System.out.println("\nPizza3 is delivered");
		Addable pizza = new PizzaDough("Pizza Dough", 4);
		pizza = new Sausage(pizza, "Sausage", 2);
		pizza = new Tomato(pizza, "Tomato", 1);
		pizza = new Olive(pizza, "Olive", 2);
		pizza = new Mushroom(pizza, "Mushroom", 1);
		System.out.println("\nCost: " + pizza.calculatePrice());
		
		printToppings(pizza);
	}

	private void printToppings(Addable tost) {
		for(Topping topping : tost.getToppings())
			System.out.println(topping);
	}
}

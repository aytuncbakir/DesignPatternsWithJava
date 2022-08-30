package behavioral.observer;

public class Product {
	
	private String name;
	private int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "- "+getName() + " - price " + getPrice();
	}
	
	
	

}

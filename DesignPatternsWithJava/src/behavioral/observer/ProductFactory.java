package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {
	
	public static List<Product> createProducts() {
		
		Product product = null;
		List<Product> productList = new ArrayList<Product>();
		System.out.println("Products");
		System.out.println("------------------------------------------------------------------");
		for(int i = 1; i <= 10; i++) {
			product = new Product("product"+i, i*10);
			productList.add(product);
			System.out.println(i+product.toString());
		}
		System.out.println("------------------------------------------------------------------");
		return productList;
	}

}

package behavioral.observer;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class ShoppingSite extends Observable {

    private BigDecimal currentPrice;
    private BigDecimal observedPrice;
    
    
    private List<Product> productList;


    public ShoppingSite( BigDecimal observedPrice) {
		super();
		this.observedPrice = observedPrice;
		productList = ProductFactory.createProducts();
	}
    
    

	public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void checkPrice() {
    	
    	// suppose that user observe product5

    	currentPrice = BigDecimal.valueOf(productList.get(4).getPrice());
    	System.out.println("Observers observe " + productList.get(4));
    	
    	

        boolean isTooCheap = currentPrice.compareTo(observedPrice) >= 0;
        if (isTooCheap){
        	notifyAllObservers();
        }
    }
}









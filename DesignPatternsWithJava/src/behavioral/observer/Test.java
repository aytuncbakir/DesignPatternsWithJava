package behavioral.observer;

import java.math.BigDecimal;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {
    	
    	
        BigDecimal observedPrice = BigDecimal.valueOf(30);
        

        ShoppingSite site = new ShoppingSite(observedPrice);

        Customer customer1 = new Customer("Anna");
        Customer customer2 = new Customer("Barbara");

        site.addObserver(customer1);
        site.addObserver(customer2);
        

        site.checkPrice();

       
    }
}

package structural_patterns.composite;

import java.math.BigDecimal;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        Product grape = new Product("Grape", BigDecimal.ONE);
        Product pear = new Product("Pear", BigDecimal.ONE);
        Product apple = new Product("Apple", BigDecimal.ONE);

        Package fruitPackage = new Package("Fruit Package");
        fruitPackage.getProductList().add(apple);
        fruitPackage.getProductList().add(pear);
        fruitPackage.getProductList().add(grape);
        

        Product soap = new Product("Cleaning Product", BigDecimal.valueOf(5));
        Product detergent = new Product("Cleaning Product", BigDecimal.valueOf(5));

        Package cleaningPackage = new Package("CleaningPackage");
        cleaningPackage.getProductList().add(soap);
        cleaningPackage.getProductList().add(detergent);


        Product cheese = new Product("Milk Products", BigDecimal.valueOf(4));
        Product butter = new Product("Milk Products", BigDecimal.valueOf(7));

        FixedPackage fixedPackage = new FixedPackage("Fixed Package");
        fixedPackage.getPackageList().add(cleaningPackage);
        fixedPackage.getProductList().add(butter);
        fixedPackage.getProductList().add(cheese);
        
        Product mirror = new Product("Accesories", BigDecimal.valueOf(10));

        Cart cart = new Cart("My Cart");
        cart.getPriceableList().add(fruitPackage);
        cart.getPriceableList().add(cleaningPackage);
        cart.getPriceableList().add(fixedPackage);
        cart.getPriceableList().add(mirror);
        
        Priceable service = new Service("Service fee", BigDecimal.valueOf(3));
        Priceable tax = new Tax("Tax", BigDecimal.valueOf(7));
        Priceable shipment = new Shipment("Tax", BigDecimal.valueOf(12));
        cart.getPriceableList().add(service);
        cart.getPriceableList().add(tax);
        cart.getPriceableList().add(shipment);

        BigDecimal totalAmount = cart.totalAmountToPay();
        System.out.println("Total amaount = " + totalAmount + " $");
    }
}

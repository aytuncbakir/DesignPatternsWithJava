package behavioral.mediator;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public enum EnumProduct {

    CHEESE("Cheese"),
    EGG("Egg")
    ;

    private String productName;

    EnumProduct(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}

package behavioral.mediator;

import java.math.BigDecimal;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public abstract class Producer {

    private String name;
    private EnumProduct product;
    private BigDecimal price;

    private Mediator mediator;

    public Producer(String name, EnumProduct product, BigDecimal price, Mediator mediator) {
		super();
		this.name = name;
		this.product = product;
		this.price = price;
		this.mediator = mediator;
	}

	public void sellProduct(){
		mediator.buyFromProducer(this);
    }

    public String getName() {
        return name;
    }

    public EnumProduct getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

package structural_patterns.composite;

import java.math.BigDecimal;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Product implements Priceable{

    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal fiyat) {
        this.name = name;
        this.price = fiyat;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

    
}

package structural_patterns.composite;

import java.math.BigDecimal;

public class Service extends Fee {

	private String name;
    private BigDecimal price;

    public Service(String name, BigDecimal fiyat) {
        this.name = name;
        this.price = fiyat;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}
	

}

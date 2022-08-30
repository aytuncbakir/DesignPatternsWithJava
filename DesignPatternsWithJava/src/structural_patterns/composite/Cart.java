package structural_patterns.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Cart {

    private String name;
    private List<Priceable> priceableList;

    public Cart(String name) {
        this.name = name;
        this.priceableList = new ArrayList<>();
    }

    public BigDecimal totalAmountToPay(){

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Priceable priceable : priceableList) {
        	totalPrice = totalPrice.add(priceable.getPrice());
        }

        return totalPrice;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Priceable> getPriceableList() {
		return priceableList;
	}

	public void setPriceableList(List<Priceable> priceableList) {
		this.priceableList = priceableList;
	}

    
}

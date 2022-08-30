package structural_patterns.composite;

import java.math.BigDecimal;

public abstract class Fee implements Priceable{
	public abstract BigDecimal getPrice();
}

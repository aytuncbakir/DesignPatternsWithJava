package behavioral.strategy;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public abstract class Money {
	
	
	private int amount;
	public Money(int amount) {
		super();
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	

}

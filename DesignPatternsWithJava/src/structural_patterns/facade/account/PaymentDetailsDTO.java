package structural_patterns.facade.account;

public class PaymentDetailsDTO {
	
	 private String nameOnTheCard;
	 private String cardNumber;
	 private long expireMonth;
	 private long expireYear;
	 private long cvvNumber;
	 
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public long getExpireMonth() {
		return expireMonth;
	}

	public long getExpireYear() {
		return expireYear;
	}

	public long getCvvNumber() {
		return cvvNumber;
	}

	public PaymentDetailsDTO(String nameOnTheCard, String cardNumber, long expireMonth, long expireYear,
			long cvvNumber) {
		super();
		this.nameOnTheCard = nameOnTheCard;
		this.cardNumber = cardNumber;
		this.expireMonth = expireMonth;
		this.expireYear = expireYear;
		this.cvvNumber = cvvNumber;
	}
	 
	
	 

}

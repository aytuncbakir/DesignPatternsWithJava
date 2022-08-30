package structural_patterns.facade.debt;

import java.math.BigDecimal;
import java.util.Date;

import structural_patterns.facade.account.EnumDebtType;

public class Debt {
	
	 private long id;
	 private EnumDebtType debtType;
	 private BigDecimal debtAmount;
	 private Date expiryDate;
	 
	public Debt(long id, EnumDebtType debtType, BigDecimal debtAmount,Date  expiryDate) {
		super();
		this.id = id;
		this.debtType = debtType;
		this.debtAmount = debtAmount;
		this.expiryDate = expiryDate;
	}

	public long getId() {
		return id;
	}

	public EnumDebtType getDebtType() {
		return debtType;
	}

	public BigDecimal getDebtAmount() {
		return debtAmount;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}
	
	
	 
	 

}

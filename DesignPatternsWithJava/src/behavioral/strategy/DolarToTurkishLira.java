package behavioral.strategy;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class DolarToTurkishLira implements Exchange {

	@Override
	public double exchage(double amount) {
		amount = takeCommission(amount);
		amount = amount * ValuesGettingFromCentralBank.dolarCurreny;
		return amount;
	}

	@Override
	public double takeCommission(double amount) {
		amount = amount - ValuesGettingFromCentralBank.dolarCommission;
		return amount;
	}

   
}

package behavioral.strategy;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class EuroToTurkishLira implements Exchange {

	@Override
	public double exchage(double amount) {
		amount = takeCommission(amount);
		amount = amount * ValuesGettingFromCentralBank.ueroCurreny;
		return amount;
	}

	@Override
	public double takeCommission(double amount) {
		amount = amount - ValuesGettingFromCentralBank.euroCommission;
		return amount;
	}

    
}

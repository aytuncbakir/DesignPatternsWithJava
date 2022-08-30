package structural_patterns.facade.facade;

import java.math.BigDecimal;

import structural_patterns.facade.account.Account;
import structural_patterns.facade.account.PaymentDetailsDTO;
import structural_patterns.facade.citizen.CitizenControlService;
import structural_patterns.facade.delayed.LateFeeCalculationService;
import structural_patterns.facade.payment.PaymentControlService;
import structural_patterns.facade.payment.creditCard.CreditCardService;

public class PaymentFacade {

	private LateFeeCalculationService lateFeeCalculationService;
	private PaymentControlService paymentControlService;
	private CreditCardService creditCardService;
	private CitizenControlService citizenControlService;

	public PaymentFacade() {
		lateFeeCalculationService = new LateFeeCalculationService();
		paymentControlService = new PaymentControlService();
		creditCardService = new CreditCardService();
		citizenControlService = new CitizenControlService();
	}

	public boolean doPayment(Account account, PaymentDetailsDTO paymentDetailsDTO) {
		
		if(citizenControlService.isCitizen(account)) {
			System.out.println("You have to visit our office");
			return false;
		}

		boolean isDebtPayable = paymentControlService.checkPayment(account);
		if (!isDebtPayable) {
			return false;
		}

		BigDecimal debtAmount = account.getDebt().getDebtAmount();
		BigDecimal lateFeeAmaount = lateFeeCalculationService.lateFeeCalculation(debtAmount, account.getDebt().getExpiryDate());
		BigDecimal totalAmount = debtAmount.add(lateFeeAmaount);

		System.out.println("Info: " + totalAmount + " will be try to pay.");
		boolean isSuccess = creditCardService.tryToPaymentFromCart(paymentDetailsDTO, totalAmount);
		return isSuccess;
	}

}

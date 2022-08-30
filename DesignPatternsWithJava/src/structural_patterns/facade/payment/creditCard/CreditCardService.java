package structural_patterns.facade.payment.creditCard;

import java.math.BigDecimal;

import structural_patterns.facade.account.PaymentDetailsDTO;

public class CreditCardService {
	
	private CreditCardControlService creditCardControlService;

    public CreditCardService() {
    	creditCardControlService = new CreditCardControlService();
    }

    public boolean tryToPaymentFromCart(PaymentDetailsDTO paymentDetailsDTO, BigDecimal payableAmount){
        
    	boolean isCreditCartValid = creditCardControlService.isCreditCarAvailable(paymentDetailsDTO);
        if (!isCreditCartValid){
            return false;
        }

        boolean isEnoughLimit = isEnoughLimitOnAccount(paymentDetailsDTO, payableAmount);
        if (!isEnoughLimit){
            return false;
        }
        System.out.println( payableAmount + " is taken from the account.");
        return true;
    }

    private boolean isEnoughLimitOnAccount(PaymentDetailsDTO paymentDetailsDTO, BigDecimal payableAmount) {

        BigDecimal limit = getCreditCardLimit(paymentDetailsDTO);

        boolean isEnoughLimit = limit.compareTo(payableAmount) > 0;

        if (!isEnoughLimit){
            System.out.println("There is no enough money!");
        }
        return isEnoughLimit;
    }

    private BigDecimal getCreditCardLimit(PaymentDetailsDTO paymentDetailsDTO) {

        BigDecimal limit = BigDecimal.ZERO;
        String nameOnTheCard = paymentDetailsDTO.getNameOnTheCard();

        if (nameOnTheCard.contains("John")){
            limit = new BigDecimal(1000);
        } else if (nameOnTheCard.contains("Adam")){
            limit = new BigDecimal(1000);
        } else if (nameOnTheCard.contains("Julia")){
            limit = BigDecimal.TEN;
        }
        return limit;
    }

}

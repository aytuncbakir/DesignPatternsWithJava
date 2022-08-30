package structural_patterns.facade.payment.creditCard;

import java.util.Date;

import structural_patterns.facade.account.PaymentDetailsDTO;
import structural_patterns.facade.date.DateService;

public class CreditCardControlService {
	
	public boolean isCreditCarAvailable(PaymentDetailsDTO paymentDetailsDTO){

        Long expiryMonth = paymentDetailsDTO.getExpireMonth();
        Long expiryYear = paymentDetailsDTO.getExpireYear();

        Date today = DateService.getToday();
        Long month = DateService.getAvailableMonth(today);
        Long year  = DateService.getAvailableYear(today);

        boolean isCreditCartAvailable = false;
        if (expiryYear.compareTo(year) > 0){
        	isCreditCartAvailable = true;
        } else if (expiryYear.compareTo(year) == 0){
            if (expiryMonth.compareTo(month) >= 0){
            	isCreditCartAvailable = true;
            }
        }

        if (!isCreditCartAvailable){
            System.out.println("Invalid Credit Cart!");
        }
        return isCreditCartAvailable;
    }

}

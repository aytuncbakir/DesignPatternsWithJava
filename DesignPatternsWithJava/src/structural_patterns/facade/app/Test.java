package structural_patterns.facade.app;

import java.math.BigDecimal;
import java.util.Date;

import structural_patterns.facade.account.Account;
import structural_patterns.facade.account.EnumDebtType;
import structural_patterns.facade.account.PaymentDetailsDTO;
import structural_patterns.facade.date.DateService;
import structural_patterns.facade.debt.Debt;
import structural_patterns.facade.facade.PaymentFacade;

public class Test {

	public static void main(String... args) {
		PaymentFacade paymentFacade = new PaymentFacade();

        Long id = 1L;
        BigDecimal debtAmount = new BigDecimal(10);
        EnumDebtType debtType = EnumDebtType.NORMAL;
        Date expiryDate =  DateService.createDate("24.07.2022");

        Debt debt = new Debt(id, debtType, debtAmount, expiryDate);
        Account account = new Account(id, "John", "********",debt);
        
        PaymentDetailsDTO paymentDetailsDTO = new PaymentDetailsDTO("John", "12345456", 01L, 2023L, 123L);
        boolean isSuccess = paymentFacade.doPayment(account, paymentDetailsDTO);
        		

        if (isSuccess){
            System.out.println("Payment is done!");
        } else {
            System.out.println("Payment is not done!");
        }
	}
}

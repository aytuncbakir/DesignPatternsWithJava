package structural_patterns.facade.delayed;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import structural_patterns.facade.date.DateService;

public class LateFeeCalculationService {

	private LateFeeRateService  lateFeeRateService;

    public LateFeeCalculationService() {
    	lateFeeRateService = new LateFeeRateService();
    }

    public BigDecimal lateFeeCalculation(BigDecimal amount, Date expiryDate){

        BigDecimal lateFeeAmaount = BigDecimal.ZERO;
        if (expiryDate.compareTo(new Date()) > 0){
            return lateFeeAmaount;
        }
        lateFeeAmaount = lateFeeAmountCalculation(amount, expiryDate);
        return lateFeeAmaount;
    }

    private BigDecimal lateFeeAmountCalculation(BigDecimal lateFeeAmaount, Date expiryDate) {

        BigDecimal lateFeeRate = lateFeeRateService.getLateFeeRateOran();
        Date today =  DateService.getToday();
        long dayDifferenceL = DateService.calculateTheDifference(expiryDate, today);
        BigDecimal dayDifference = BigDecimal.valueOf(dayDifferenceL);
        System.out.println("Fee Day:  "+ dayDifference);
        BigDecimal lateFee = lateFeeRate.multiply(dayDifference).multiply(lateFeeAmaount);
        lateFee = lateFee.setScale(2, RoundingMode.HALF_DOWN);
        if (lateFee.compareTo(BigDecimal.ZERO) > 0){
            System.out.println("Info: Late fee is calculated. Late fee amount: " + lateFee);
        }
        return lateFee;
    }
}

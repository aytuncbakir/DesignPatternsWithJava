package structural_patterns.facade.delayed;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LateFeeRateService {
	
	public BigDecimal getLateFeeRateOran() {
        BigDecimal rate = new BigDecimal("1.2");
        rate = rate.divide(new BigDecimal(100), 4 , RoundingMode.HALF_DOWN);
        return rate;
    }
}

package structural_patterns.composite;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class CalculationService {

    public static BigDecimal getTotalProductPrice(List<Product> productList){

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : productList) {
        	totalPrice = totalPrice.add(product.getPrice());
        }

        return totalPrice;
    }

    public static BigDecimal getTotalPackagePrice(List<Package> packagetList){

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Package packagee : packagetList) {
        	totalPrice = totalPrice.add(packagee.getPrice());
        }

        return totalPrice;
    }
}

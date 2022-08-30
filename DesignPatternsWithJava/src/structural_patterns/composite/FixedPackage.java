package structural_patterns.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class FixedPackage implements Priceable {

    private String name;
    private List<Product> productList;
    private List<Package> packageList;

    public FixedPackage(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packageList = new ArrayList<>();
    }

    @Override
    public BigDecimal getPrice() {

        BigDecimal totalProductPrice = CalculationService.getTotalProductPrice(productList);
        BigDecimal totalPackagePrice = CalculationService.getTotalPackagePrice(packageList);
        BigDecimal totalPrice = totalProductPrice.add(totalPackagePrice);

        return totalPrice;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public List<Package> getPackageList() {
		return packageList;
	}

	public void setPackageList(List<Package> packageList) {
		this.packageList = packageList;
	}
    
}

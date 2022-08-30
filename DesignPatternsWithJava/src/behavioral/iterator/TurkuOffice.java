package behavioral.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class TurkuOffice implements Office{

	private String name;
    private List<Customer> customers;

    public TurkuOffice(String name) {
        this.name = name;
    }

    public String getName() {
		return name;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

    public Iterator<Customer> getCustomerIterator() {
        return customers.iterator();
    }

}

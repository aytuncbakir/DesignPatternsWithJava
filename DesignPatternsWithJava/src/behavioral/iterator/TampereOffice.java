package behavioral.iterator;

import java.util.Iterator;
import java.util.Map;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class TampereOffice implements Office{

	private String name;
    private Map<String,Customer> customers;

    public TampereOffice(String name) {
        this.name = name;
    }

    public String getName() {
		return name;
	}

	public Map<String,Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Map<String,Customer> customers) {
		this.customers = customers;
	}

    public Iterator<Customer> getCustomerIterator() {
    	Iterator<Customer> iterator = customers.values().iterator();
        return iterator;
    }

}

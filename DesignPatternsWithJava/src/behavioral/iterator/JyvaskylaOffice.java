package behavioral.iterator;

import java.util.Iterator;
import java.util.Set;

public class JyvaskylaOffice implements Office{

	private String name;
    private Set<Customer> customers;

    public JyvaskylaOffice(String name) {
        this.name = name;
    }

    public String getName() {
		return name;
	}

	public  Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers( Set<Customer> customers) {
		this.customers = customers;
	}
	@Override
    public Iterator<Customer> getCustomerIterator() {
        return customers.iterator();
    }
}

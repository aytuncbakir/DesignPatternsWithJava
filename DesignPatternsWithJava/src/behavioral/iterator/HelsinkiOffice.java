package behavioral.iterator;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class HelsinkiOffice implements Office{

    private String name;
    private Customer[] customers;

    public HelsinkiOffice(String name) {
        this.name = name;
    }

   

    public String getName() {
		return name;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public CustomerIterator getCustomerIterator() {
        return new CustomerIterator(customers);
    }

}

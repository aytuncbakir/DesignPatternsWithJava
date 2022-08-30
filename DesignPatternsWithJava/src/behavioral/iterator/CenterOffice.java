package behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class CenterOffice {

	List<Office> offices;

	public void showCustomers() {

		offices = OfficeFactory.createOffices();
		for (Office office : offices) {
			printcustomers(office.getCustomerIterator());
		}

	}

	private static void printcustomers(Iterator<Customer> customerIterator) {
		while (customerIterator.hasNext()) {
			Customer customer = (Customer) customerIterator.next();

			System.out.println("Customer Details: " + customer.getId() + " - " + customer.getName());
		}
	}

	public List<Office> getOffices() {
		return offices;
	}

	public void setOffices(List<Office> offices) {
		this.offices = offices;
	}

}

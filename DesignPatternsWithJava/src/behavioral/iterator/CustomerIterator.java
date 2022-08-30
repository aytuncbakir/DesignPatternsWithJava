package behavioral.iterator;

import java.util.Iterator;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class CustomerIterator implements Iterator<Customer> {

    private Customer[] customers;
    private int index;

    public CustomerIterator(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public boolean hasNext() {
        if (index < customers.length)
            return true;
        return false;
    }

    @Override
    public Customer next() {
        Customer customer = customers[index];
        index++;
        return customer;
    }
}

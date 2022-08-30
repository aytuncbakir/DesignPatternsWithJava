package behavioral.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerFactory {
	
	public static Customer[] createCustomerHelsinki() {
		
		Customer[]  customers = null;
		customers = createCustomerArray(customers);
		return  customers;
		
	}
	
	public static List<Customer> createCustomerTurku() {
		
		List<Customer> customers = null;
		customers = createCustomerArrayList(customers);
		return customers;
		
	}
	
	public static Set<Customer> createCustomerJyvaskyla() {
		
		Set<Customer> customers = null;
		customers = createCustomerSet(customers);
		return customers;
		
	}
	
	public static Map<String, Customer> createCustomerTampere() {
		
		Map<String, Customer> customers = null;
		customers = createCustomerMap(customers);
		return customers;
		
	}
	
	private static Customer[] createCustomerArray(Customer[] customers ) {
		customers = new Customer[5];
		String id;
		String name;
		for(int i = 1 ; i<= 5 ; i++ ) {
			id = ""+i;
			name = "Customer"+i;
			customers[i-1] = new Customer(id,name);
		}
		return customers;
	}
	
	private static List<Customer> createCustomerArrayList(List<Customer> customers ) {
		customers = new ArrayList<Customer>();
		String id;
		String name;
		Customer customer = null;
		for(int i = 6 ; i<= 10 ; i++ ) {
			id = ""+i;
			name = "Customer"+i;
			customer =  new Customer(id,name);
			customers.add(customer);
		}
		return customers;
	}
	
	private static Set<Customer> createCustomerSet(Set<Customer> customers ) {
		customers = new HashSet<Customer>();
		String id;
		String name;
		Customer customer = null;
		for(int i = 11 ; i<= 15 ; i++ ) {
			id = ""+i;
			name = "Customer"+i;
			customer =  new Customer(id,name);
			customers.add(customer);
		}
		return customers;
	}
	
	private static Map<String, Customer> createCustomerMap(Map<String, Customer> customers ) {
		customers = new HashMap<String, Customer>();
		String id;
		String name;
		Customer customer = null;
		for(int i = 16 ; i<= 20 ; i++ ) {
			id = ""+i;
			name = "Customer"+i;
			customer =  new Customer(id,name);
			customers.put(id, customer);
		}
		return customers;
	}

}

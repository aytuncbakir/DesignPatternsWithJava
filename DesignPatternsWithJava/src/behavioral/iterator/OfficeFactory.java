package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class OfficeFactory {
	
	public static List<Office> createOffices(){
		 
		List<Office> offices = new ArrayList<Office>();
		 
		TurkuOffice turku = new TurkuOffice("Turku");
		turku.setCustomers(CustomerFactory.createCustomerTurku());
		HelsinkiOffice helsinki = new HelsinkiOffice("Helsinki");
		helsinki.setCustomers(CustomerFactory.createCustomerHelsinki());
		TampereOffice tampere = new TampereOffice("Tampere");
		tampere.setCustomers(CustomerFactory.createCustomerTampere());
		JyvaskylaOffice jyvaskyla = new JyvaskylaOffice("Jyvaskyla");
		jyvaskyla.setCustomers(CustomerFactory.createCustomerJyvaskyla());
			
		offices.add(turku);
		offices.add(helsinki);
		offices.add(tampere);
		offices.add(jyvaskyla);
		
		return offices;
	}

}

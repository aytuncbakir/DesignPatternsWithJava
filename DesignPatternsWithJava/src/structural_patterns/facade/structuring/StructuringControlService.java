package structural_patterns.facade.structuring;

import java.util.Date;

import structural_patterns.facade.date.DateService;

public class StructuringControlService {
	
	public boolean isStructuringAvailable(Date expiryDate) {

		Date today = DateService.getToday(); 
		long difference = DateService.calculateTheDifference(expiryDate, today);
		
		
		System.out.println("Delayed day : "+ difference);
		boolean isStillStructuringAvailable = difference > 90;

		if (isStillStructuringAvailable) {
			System.out.println("Structuring is broken! No right to pay!");
		}
		return isStillStructuringAvailable;
	}

}

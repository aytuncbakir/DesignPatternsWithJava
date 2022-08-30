package structural_patterns.facade.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {

	public static Date getToday() {

		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		String dateStr = format.format(new Date());
		Date date = null;
		try {
			date = format.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static long calculateTheDifference(Date firstDay, Date lastDay) {

		long constantForDay = 24 * 60 * 60 * 1000;
		long first = firstDay.getTime();
		long last = lastDay.getTime();
		long difference = (last / constantForDay) - (first / constantForDay);
		return difference;
	}

	public static long getAvailableYear(Date date) {
		String yearAsString = new SimpleDateFormat("yyyy").format(date);
		return Long.valueOf(yearAsString);
	}

	public static long getAvailableMonth(Date date) {
		String monthAsString = new SimpleDateFormat("MM").format(date);
		return Long.valueOf(monthAsString);
	}

	public static Date createDate(String dateString) {
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		try {
			date = format.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}

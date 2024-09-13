package lesson12_api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar.*;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar();
//		Calendar cal2 = Calendar.getInstance();
		
		Date date = new Date(cal.getTimeInMillis());
		date.setTime(cal.getTimeInMillis());
		
		cal.setTimeInMillis(date.getTime());
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(cal.ERA);
		System.out.println(cal.MONTH);
		System.out.println(cal.DATE);
		System.out.println(cal.DAY_OF_MONTH);
		System.out.println(cal.DAY_OF_WEEK);
		System.out.println((cal.ZONE_OFFSET)/1000/60/60);
		
	}
}

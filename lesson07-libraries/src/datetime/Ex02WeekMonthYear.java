package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import common.Weekday;

public class Ex02WeekMonthYear {
	
	
	public static void main(String[] args) {
		
		Weekday[] weekday = Weekday.values();
		
		Calendar c = Calendar.getInstance();
		
		// Sunday(1), Monday(2),....Saturday(7)
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfWeek: " + weekday[dayOfWeek - 1]);
		
//		c.set(Calendar.DAY_OF_MONTH, 27);
//		dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println("dayOfWeek: " + weekday[dayOfWeek - 1]);
		
		
		
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		
		
		System.out.println("weekOfMonth: " + weekOfMonth);
		
		
		//xem thu con may ngay nua la den tet.
		c.set(Calendar.YEAR, 2020);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int year = c.get(Calendar.YEAR);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Is" + year + "Leap Year :" + new GregorianCalendar());
		System.out.println("Year" + year + "has" + daysInYear + "day");
		System.out.println("Today is " + dayOfYear +" th day " );
		System.out.println("Remain days " + (daysInYear - dayOfYear) );
		
		//xem thu thang hien tai co bao nhieu ngay
		int month = c.get(Calendar.MONTH);
		int dayInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + month + " has " + dayInMonth );
		
		
		
		
		
	}
}

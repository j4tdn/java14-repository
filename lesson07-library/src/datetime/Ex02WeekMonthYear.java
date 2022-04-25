package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import common.WeekDay;

public class Ex02WeekMonthYear {
	

	public static void main(String[] args) {
		WeekDay[] weekDays = WeekDay.values();
		Calendar c = Calendar.getInstance();
		// Sunday (1)
		c.set(Calendar.DAY_OF_MONTH, 27);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		System.out.println("day of week: " + weekDays[dayOfWeek-1]);
		
		//int weekOfMonth= c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear=c.get(Calendar.WEEK_OF_YEAR);
		int dayOfYear=c.get(Calendar.DAY_OF_YEAR);
		//System.out.println("weekOfYear: "+weekOfYear);
		c.set(Calendar.YEAR, 2020);
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println("Is leap year: "+ new GregorianCalendar().isLeapYear(Calendar.YEAR));
		int year = c.get(Calendar.YEAR);
		int daysInYear=c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println("Year: "+year+" has "+daysInYear+" days");
		System.out.println("to day is: "+dayOfYear+" th in year");
		System.out.println("remaining days: "+(daysInYear-dayOfYear));
		
		// xem thu thang hien tai co may ngay
		int month= c.get(Calendar.MONTH) +1;
		int daysInMonth= c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month "+month+" has "+daysInMonth+" days");
		
	}

}

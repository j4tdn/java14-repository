package datetime;

import java.util.Calendar;

import common.Weekday;

import static utils.DateTimeUtils.*;

public class Ex03FirstDayOfWeek {

	private static String pattern = "dd/MM/yyyy";

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		print("hello", pattern, c);
		int fdow = c.getFirstDayOfWeek();
		System.out.println("First day of week : " + fdow);
		
		Weekday fdowAsString = getFirstDayOfWeekAsString(c);
		System.out.println("First day of week as string " + fdowAsString);

	}
	
	public static int getFirstDayOfWeekAsInt(Calendar calendar) {
		return calendar.getFirstDayOfWeek();
	}
	
	
	public static Weekday getFirstDayOfWeekAsString(Calendar calendar) {
		Weekday[] weekdays = Weekday.values();
		int dow = calendar.getFirstDayOfWeek();
		return weekdays[dow-1];
	}
	
}

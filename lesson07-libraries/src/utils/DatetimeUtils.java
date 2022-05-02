package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import common.Weekday;

public class DatetimeUtils {
	private DatetimeUtils() {

	}
	public static Date stringToDate(String dateaAsString, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.parse(dateaAsString);
	}
	public static void print(String text,String pattern, Calendar calendar) {
		print(text,pattern, calendar.getTime());
	}
	
	public static void print(String text,String pattern, Date date) {
		DateFormat df = new SimpleDateFormat(pattern);
		
		System.out.println(text + ":" +df.format(date));
	}
	
}


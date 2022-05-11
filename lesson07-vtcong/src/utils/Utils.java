package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Utils {
	private Utils() {
		
	}
	
	public static Date stringtoDate(String dateAsString, String pattern) throws ParseException {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.parse(dateAsString);
	}
	
	
	public static Calendar stringtoCalendar(String dateAsString, String pattern) throws ParseException {
		return datetoCalendar(stringtoDate(dateAsString,pattern));
	}
	
	public static String dateToString(Date date, String pattern) {
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}
	
	
	public static Calendar datetoCalendar(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	public static String calendarToString(Calendar c, String pattern) {
		return dateToString(calendartoDate(c),pattern);
	}
	
	public static Date calendartoDate(Calendar c) {
		return c.getTime();
	}
	
	
	public static void print(String text,String pattern,Calendar calendar) {
		print(text , pattern, calendar.getTime());
	} 
	public static void print(String text,String pattern,Calendar calendar, TimeZone zone) {
		print(text , pattern, calendar.getTime(),zone);
	}
	
	public static void print(String text,String pattern,Date date, TimeZone zode) {
		DateFormat df = new SimpleDateFormat(pattern);
		df.setTimeZone(zode);
		System.out.println(text+" : "+df.format(date));
	}
	
	public static void print(String text,String pattern,Date date) {
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(text+" : "+df.format(date));
	}
}

package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import common.WeekDay;

public class DateTimeUtils {
	private DateTimeUtils() {
	}
	public static Date stringToDate(String dateAsString,String pattern) throws ParseException {
		DateFormat df= new SimpleDateFormat(pattern);
		return df.parse(dateAsString);
		
	}
	public static Calendar stringToCalendar(String dateAsString,String pattern) throws ParseException {
		return dateToCalendar(stringToDate(dateAsString, pattern));
		
	}
	
	public static String dateToString(Date date,String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(df);
		
	}
	public static Calendar dateToCalendar(Date date) {
		Calendar c= Calendar.getInstance();
		c.setTime(date);
		return c;
		
	}
	public static void print(String text,String pattern,Calendar calendar) {
		print(text,pattern, calendar.getTime());
	}
	public static void print(String text,String pattern,Date date) {
		DateFormat df= new SimpleDateFormat(pattern);
		System.out.println(text+" : "+df.format(date));
	}
	public static int getFirstDayOfWeekAsInt(Calendar calendar) {
		return calendar.getFirstDayOfWeek();
	}
	public static WeekDay getFirstDayOfWeekAsString(Calendar calendar) {
		int fdof=getFirstDayOfWeekAsInt(calendar);
		WeekDay[] weekDays=WeekDay.values();
		return weekDays[fdof-1];
	}

}

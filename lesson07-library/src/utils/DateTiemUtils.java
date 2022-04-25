package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import common.WeekDay;

public class DateTiemUtils {
	private DateTiemUtils() {
		// TODO Auto-generated constructor stub
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

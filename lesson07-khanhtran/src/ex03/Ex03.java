package ex03;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import utils.DatetimeUtils;

public class Ex03 {
	
	private static Scanner ip = new Scanner(System.in);
	
	private static DateFormat df = new SimpleDateFormat("EEEE", Locale.getDefault());
    public static void main(String[] args) {
		printTimeAtTimeZone("Europe/Monaco");
		lastDayOfMonth();
		firstDayOfWeek();
		lastDayOfWeek();
		weekOfYear();
		afterN_Days(20);
		calculateDayOfBirth();
	}
    // 1
    public static void printTimeAtTimeZone(String zone) {
    	TimeZone tmp = TimeZone.getTimeZone(zone);
    	Calendar calendar = Calendar.getInstance();
    	DatetimeUtils.print("Now", "dd/MM/yyyy HH:mm:ss", calendar, tmp);
    }
    // 2
    public static void lastDayOfMonth() {
    	Calendar calendar = Calendar.getInstance();
    	System.out.println("Last Day Of Month: " + calendar.getMaximum(Calendar.DATE));
    }
    // 3
    public static void firstDayOfWeek() {
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
    	DatetimeUtils.print("First Day Of Week: ","dd/MM/yyyy HH:mm:ss" , calendar);
    }
    public static void lastDayOfWeek() {
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek()+6);
    	DatetimeUtils.print("Last Day Of Week: ","dd/MM/yyyy HH:mm:ss" , calendar);
    }
    // 4
    public static void weekOfYear() {
    	Calendar calendar = Calendar.getInstance();
    	System.out.println("Week of Year: " + calendar.get(Calendar.WEEK_OF_YEAR));
    }
    // 5
    public static void afterN_Days(int n) {
    	Calendar calendar = Calendar.getInstance();
    	DatetimeUtils.print("Now: ","dd/MM/yyyy HH:mm:ss" , calendar);
    	calendar.add(Calendar.DAY_OF_MONTH, n);
    	DatetimeUtils.print(n + " Days after: ","dd/MM/yyyy HH:mm:ss" , calendar);
    	System.out.println("Day of Week: " + df.format(calendar.getTime()));
    }
    // 6
    private static Calendar getTime(int year, int month, int date, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date, hour, minute, second);
		return c;
	}
    public static Calendar enterCalendar(String input) {
    	System.out.println(input);
    	System.out.print("Enter year: ");
    	int year = Integer.parseInt(ip.next());
    	System.out.print("Enter month: ");
    	int month = Integer.parseInt(ip.next());
    	System.out.print("Enter day: ");
    	int day = Integer.parseInt(ip.next());
    	System.out.print("Enter hour: ");
    	int hour = Integer.parseInt(ip.next());
    	System.out.print("Enter minute: ");
    	int minute = Integer.parseInt(ip.next());
    	System.out.print("Enter second: ");
    	int second = Integer.parseInt(ip.next());
    	return getTime(year, month, day, hour, minute, second);
    }
    public static void calculateDayOfBirth() {
    	Calendar dateOfBirth = enterCalendar("Enter Day Of Birth:");
    	Calendar now = Calendar.getInstance();
    	
    	DatetimeUtils.print("start", "dd/MM/yyyy HH:mm:ss", dateOfBirth);
		DatetimeUtils.print("now", "dd/MM/yyyy HH:mm:ss", now);
    	
    	long startInMilliseconds = dateOfBirth.getTimeInMillis();
    	long nowInMilliseconds = now.getTimeInMillis();
    	
    	long duration = nowInMilliseconds - startInMilliseconds;
    	long days = TimeUnit.MILLISECONDS.toDays(duration);
    	
    	System.out.println("Duration in Days: " + days);
    }
}

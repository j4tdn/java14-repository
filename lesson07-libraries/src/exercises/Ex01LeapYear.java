package exercises;

import java.util.GregorianCalendar;

public class Ex01LeapYear {
	private static GregorianCalendar gc = new GregorianCalendar();

	public static void main(String[] args) {
		int year = 1900;
		System.out.println("is leap year: " + isLeapYear(year));
	}

	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);
	}
}

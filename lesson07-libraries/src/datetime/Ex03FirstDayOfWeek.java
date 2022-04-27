package datetime;

import java.util.Calendar;

import static utils.DatetimeUtils.*;

public class Ex03FirstDayOfWeek {
	private static String pattern = "dd/MM/yyyy";
	public static void main(String[] args) {
       Calendar c = Calendar.getInstance();
       print("hello",pattern,c);
       System.out.println("=================");
       int fdow = c.getFirstDayOfWeek();
       System.out.println("First day of week: " + fdow);
	}
}

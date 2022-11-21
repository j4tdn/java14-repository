package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04PrintSpecificDates {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");

		int month = Calendar.AUGUST;
		int year = 2022;

		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);

		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int day = 1; day <= datesInMonth; day++) {
			c.set(Calendar.DAY_OF_MONTH, day);
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(df.format(c.getTime()));
			}
		}
	}
}

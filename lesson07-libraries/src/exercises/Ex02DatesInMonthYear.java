package exercises;

import java.util.Calendar;

public class Ex02DatesInMonthYear {
	public static void main(String[] args) {
		int month = Calendar.NOVEMBER;
		int year = 2022;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		
		int dateOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(dateOfMonth);
		
		int dateOfYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(dateOfYear);
		

	}
}	

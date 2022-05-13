package ex04;

import java.util.Calendar;
import utils.DatetimeUtils;

public class Ex04 {
    public static void main(String[] args) {
    	Calendar[] holidays = getVnHolidays();
		Calendar running = getInstance(13, Calendar.MAY, 2020);
		System.out.println("start: " + DatetimeUtils.calendarToString(running, "dd/MM/yyyy"));
		
		int executionDays = 110;
		int workedDays = 0;
		
		while(workedDays < executionDays) {
			int dayOfWeek = running.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek != Calendar.SATURDAY 
					&& dayOfWeek != Calendar.SUNDAY
					&& !contains(holidays, running)) {
				workedDays++;
			}
			running.add(Calendar.DATE, 1);
		}
		
		System.out.println("deadline: " + DatetimeUtils.calendarToString(running, "dd/MM/yyyy"));
	}
    private static boolean contains(Calendar[] holidays, Calendar running) {
		for(Calendar holiday: holidays) {
			if (holiday.equals(running)) {
				System.out.println("holiday ---> " + DatetimeUtils.calendarToString(running, "dd/MM/yyyy"));
				return true;
			}
		}
		return false;
	}
	
	public static Calendar[] getVnHolidays() {
		// Jan 1, 2020, Jan 23 – 29, 2020
		// Apr 2, 2020, Thu, Apr 30, 2020
		// May 1, 2020, Wed, Sep 2, 2020
		int year = 2020;
		return new Calendar[] {
				getInstance(1, Calendar.JANUARY, year),
				getInstance(23, Calendar.JANUARY, year),
				getInstance(24, Calendar.JANUARY, year),
				getInstance(25, Calendar.JANUARY, year),
				getInstance(26, Calendar.JANUARY, year),
				getInstance(27, Calendar.JANUARY, year),
				getInstance(28, Calendar.JANUARY, year),
				getInstance(29, Calendar.JANUARY, year),
				getInstance(2, Calendar.APRIL, year),
				getInstance(30, Calendar.APRIL, year),
				getInstance(01, Calendar.MAY, year),
				getInstance(02, Calendar.SEPTEMBER, year)
		};
	}
	
	public static Calendar getInstance(int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}
}

package datetime;

import java.util.Calendar;

import utils.Utils;

public class Ex04CaculatorDay {
	public static void main(String[] args) {
		Calendar[] holidays = getVnHolidays();
		Calendar running = getInstance(27, Calendar.NOVEMBER, 2022);
		System.out.println("start: " + Utils.calendarToString(running, "dd/MM/yyyy"));

		int executionDays = 110;
		int workedDays = 0;

		while (workedDays < executionDays) {
			int dayOfWeek = running.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY && !contains(holidays, running)) {
				workedDays++;
			}
			running.add(Calendar.DATE, 1);
		}

		System.out.println("deadline: " + Utils.calendarToString(running, "dd/MM/yyyy"));
	}

	private static boolean contains(Calendar[] holidays, Calendar running) {
		for (Calendar holiday : holidays) {
			if (holiday.equals(running)) {
				System.out.println("holoday ---> " + Utils.calendarToString(running, "dd/MM/yyyy"));
				return true;
			}
		}
		return false;
	}

	private static Calendar[] getVnHolidays() {
		// Jan 1, 2020, Jan 23 – 29, 2020
		// Apr 2, 2020, Thu, Apr 30, 2020
		// May 1, 2020, Wed, Sep 2, 2020
		int year = 2022;
		return new Calendar[] { getInstance(1, Calendar.JANUARY, year), getInstance(2, Calendar.JANUARY, year),
				getInstance(3, Calendar.JANUARY, year), getInstance(29, Calendar.JANUARY, year),
				getInstance(30, Calendar.JANUARY, year), getInstance(31, Calendar.JANUARY, year),
				getInstance(1, Calendar.FEBRUARY, year), getInstance(2, Calendar.FEBRUARY, year),
				getInstance(3, Calendar.FEBRUARY, year), getInstance(1, Calendar.SEPTEMBER, year), 
				getInstance(02, Calendar.SEPTEMBER, year) };
	}

	private static Calendar getInstance(int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}
}

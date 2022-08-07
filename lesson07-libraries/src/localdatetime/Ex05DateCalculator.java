package localdatetime;

import java.util.Calendar;

/*
 * Hôm nay là ngày 05.05.2020 - dự án bắt đầu 
 * Thời gian hoàn thành là 110 ngày
 * không tính thứ bảy chủ nhật và ngày lễ theo luật vn
 * Tìm và in ra ngày mà dự án sẽ bàn giao
 */
public class Ex05DateCalculator {
	public static void main(String[] args) {

		Calendar running = getInstance(5, Calendar.MAY, 2020);
		System.out.println("start: " + DatetimeUtils.calendarToString(running, "dd/MM/yyyy"));
		int executionDays = 110;
		int workedDays = 0;
		Calendar[] holiday = getVNHolidays();
		while (workedDays <= executionDays) {
			int dayOfWeek = running.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY && !contains(holiday, running)) {
				workedDays++;
			}
			running.add(Calendar.DATE, 1);
		}
		System.out.println("deadline: " + DatetimeUtils.calendarToString(running, "dd/MM/yyyy"));
	}

	private static boolean contains(Calendar[] holidays, Calendar running) {
		for (Calendar holiday : holidays) {
			if (holiday.equals(running)) {
				System.out.println("holoday ---> " + DatetimeUtils.calendarToString(running, "dd/MM/yyyy"));
				return true;
			}
		}
		return false;
	}

	private static Calendar[] getVNHolidays() {
		int year = 2020;
		return new Calendar[] { getInstance(1, Calendar.JANUARY, year),
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
				getInstance(02, Calendar.SEPTEMBER, year) };
	}

	private static Calendar getInstance(int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}
}

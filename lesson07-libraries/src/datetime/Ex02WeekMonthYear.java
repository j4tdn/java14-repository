package datetime;

import java.util.Calendar;

public class Ex02WeekMonthYear {

	public static void main(String[] args) {
		WeekDay[] weekdays = WeekDay.values();

		Calendar c = Calendar.getInstance();
		// Sunday(1), Monday(2) ... Saturday(7)

		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		System.out.println("day of week: " + weekdays[dayOfWeek - 1]);

		c.set(Calendar.DAY_OF_MONTH, 27);
		dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("day of week: " + weekdays[dayOfWeek - 1]);

		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);

		System.out.println("weekOfYear: " + weekOfYear);
		System.out.println("dayOfYear: " + dayOfYear);

		// Xem thử còn mấy ngày nữa là đến Tết
		int year = c.get(Calendar.YEAR);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("year " + year + " has " + daysInYear + " days");
		System.out.println("Today is " + dayOfYear + "th day");
		System.out.println("remaning days: " + (daysInYear - dayOfYear));

	}
}

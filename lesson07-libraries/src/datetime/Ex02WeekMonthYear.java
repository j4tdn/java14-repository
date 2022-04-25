package datetime;

import java.util.Calendar;

public class Ex02WeekMonthYear {

	enum WeekDay {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}

	public static void main(String[] args) {
		WeekDay[] weekdays = WeekDay.values();

		Calendar c = Calendar.getInstance();
		// Sunday(1), Monday(2) ... Saturday(7)

		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfWeek: " + weekdays[dayOfWeek - 1]);

		c.set(Calendar.DAY_OF_MONTH, 27);
		dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfWeek: " + weekdays[dayOfWeek - 1]);
	}
}

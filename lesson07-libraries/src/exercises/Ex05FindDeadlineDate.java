package exercises;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex05FindDeadlineDate {
	private static final int Budget = 10;

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JUNE, 7);

		int implementedDate = 1;
		while (implementedDate < Budget) {
			int weekday = c.get(Calendar.DAY_OF_WEEK);
			boolean isDayOff = (weekday == Calendar.SATURDAY || weekday == Calendar.SUNDAY);
			if (!isDayOff) {
				implementedDate++;
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("deadline: " + df.format(c.getTime()));
	}
}

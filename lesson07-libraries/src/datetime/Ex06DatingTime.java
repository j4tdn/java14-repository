package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateTimeUtils;

public class Ex06DatingTime {
	public static void main(String[] args) {
		Calendar dateStart = getTime(2022, Calendar.MARCH, 20, 21, 10, 10);
		Calendar now = Calendar.getInstance();

		if (dateStart.after(now)) {
			System.out.println();
		}

		DateTimeUtils.print("Start", "dd/MM/yyyy HH:mm:ss", dateStart);
		DateTimeUtils.print("Now", "dd/MM/yyyy HH:mm:ss", now);
		
		long startInMillisecond = dateStart.getTimeInMillis();
		long nowInMillisecond = now.getTimeInMillis();
		long duration = nowInMillisecond - startInMillisecond;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long remaining = duration - TimeUnit.DAYS.toMillis(days);
		long hour = TimeUnit.MILLISECONDS.toHours(remaining);
		remaining -= TimeUnit.HOURS.toMillis(hour);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remaining);
		remaining -= TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remaining);

		System.out.println(
				"\n days :" + days + "\n hour : " + hour + "\n minutes: " + minutes + "\n seconds: " + seconds);

	}

	private static Calendar getTime(int year, int month, int date, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date, hour, minute, second);
		return c;
	}
}

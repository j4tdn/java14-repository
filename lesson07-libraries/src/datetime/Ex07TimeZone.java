package datetime;

import java.sql.Time;
import java.util.Calendar;
import java.util.TimeZone;

import utils.DateTimeUtils;

/**
 * locale(language,country) =>FirstDayOfWeek.
 * TimeZone: ZoneInfo
 * 
 *
 */

public class Ex07TimeZone {
	public static void main(String[] args) {
		System.out.println("Default TimeZone" +TimeZone.getDefault());
		
		Calendar c = Calendar.getInstance();
		DateTimeUtils.print("now", "dd/MM/yyyy hh:MM:ss", c);
		
		TimeZone tzBrLin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar berlin  = Calendar.getInstance(tzBrLin);
		DateTimeUtils.print("", "dd/MM/yyyy hh:MM:ss", berlin, tzBrLin);
		
	}
}

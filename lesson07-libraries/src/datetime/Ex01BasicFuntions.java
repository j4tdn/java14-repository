package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * JAVA07: Datetime DATE() CALENDAR()
 *
 */

public class Ex01BasicFuntions {
	public static void main(String[] args) {
		//HH -> 24 hh->12 
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		
		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println(">>> date format: "+df.format(date));

		System.out.println("=================");

		// time = 1650791275628 (epoch/unix time , now -> midnight(1.1.1970))
		Calendar calendar = Calendar.getInstance();
		System.out.println("calendar: " + calendar);

		
		int dateOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH)+1;
		int year = calendar.get(Calendar.YEAR);
		String dmy = dateOfMonth + "/" + month + "/" + year;
		System.out.println("DMY: " + dmy);
		
		
		int ap = calendar.get(Calendar.AM_PM);
		int hour24 = calendar.get(Calendar.HOUR_OF_DAY);
		int hour12 = calendar.get(Calendar.HOUR);
		int minutes = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		String hps = hour24 + ":" + minutes + ":" + seconds;
		System.out.println("HPS: " + hps);
		
		
		System.out.println(">>> calendar format: " + df.format(calendar.getTime()));
		
		
		

	}
}

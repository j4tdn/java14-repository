package singleton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Singleton pattern 
 * 
 * Allow create ONE instance of class
 */
public class DateTime {
    private static DateTime INSTANCE = null;
    
	private DateTime() {
		
	}
	public static DateTime getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DateTime();
		}
		return INSTANCE;
	}
	public String now() {
		Date date = Calendar.getInstance().getTime();
		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}
}

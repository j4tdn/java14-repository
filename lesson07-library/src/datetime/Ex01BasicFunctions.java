package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Java7 : datetime handling
 * @author Oanhpv1008
 *
 */
public class Ex01BasicFunctions {
	public static void main(String[] args) {
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("date: "+date);
		System.out.println("date format: "+df.format(date));
		
		Calendar c = Calendar.getInstance();
		System.out.println("calendar: "+ c);
		
		int dateOfMonth=c.get(Calendar.DAY_OF_MONTH);
		int month= c.get(Calendar.MONTH)+1;
		int year= c.get(Calendar.YEAR);
		String dmy= dateOfMonth+"/"+month+"/"+year;
		System.out.println("dmy: "+dmy);
		
		String ap= c.get(Calendar.AM_PM)==1?"PM": "AM";
		int hours12=c.get(Calendar.HOUR);
		int hours24=c.get(Calendar.HOUR_OF_DAY);
		int minutes=c.get(Calendar.MINUTE);
		int seconds=c.get(Calendar.SECOND);
		String hms= hours24+":"+minutes+":"+seconds +ap;
		System.out.println("hms: "+hms);
		System.out.println("calendar format: "+df.format(c.getTime()));
	}

}

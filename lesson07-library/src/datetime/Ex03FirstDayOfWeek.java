package datetime;

import java.util.Calendar;
import java.util.Locale;

import common.WeekDay;

import static utils.DateTiemUtils.*;

public class Ex03FirstDayOfWeek {
	private static String pattern ="dd/MM/yyyy";
	public static void main(String[] args) {
		// us:1
		//fr:2
		Calendar c = Calendar.getInstance(new Locale("vi","VN"));
		print("calendar", pattern, c);
		
		System.out.println("==================");
		int fdow= c.getFirstDayOfWeek();
		System.out.println("first day of week: "+ fdow);
		
		WeekDay fdowAsString=getFirstDayOfWeekAsString(c);
		System.out.println(fdowAsString);
	}

}

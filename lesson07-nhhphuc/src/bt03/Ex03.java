package bt03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex03 {
	private static SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
	private static String[] dayOfWeeks = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư","Thứ Năm","Thứ Sáu","Thứ Bảy"};
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Thời gian hiện tại : " + showTime(c));
		System.out.println("Ngày cuối của tháng: " + lastDayMonth(c));
		System.out.println("Trong tuần hiện tại: " + lastAndFirstWeek(c));
		System.out.println(weekOfYear(c));
		System.out.println("Sau 20 ngày thì đây: " + afterSomeDays(c, 20));
		Calendar myBirth = Calendar.getInstance();
		myBirth.set(2001, 2, 6);
		System.out.println("Tôi đã sống được " + myTimePass(c, myBirth) + " ngày");
	}
	
	private static String showTime(Calendar c) {
		SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss ");
		return fm.format(c.getTime());
	}
	private static String lastDayMonth(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c1.set(Calendar.MONTH, c.get(Calendar.MONTH));
		c1.set(Calendar.YEAR, c.get(Calendar.YEAR));
		return fm.format(c1.getTime());
	}
	
	private static String lastAndFirstWeek(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.set(Calendar.DAY_OF_YEAR, (c.get(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_WEEK) + 1 ));
		c2.set(Calendar.DAY_OF_YEAR, (c.get(Calendar.DAY_OF_YEAR) + (c.getMaximum(Calendar.DAY_OF_WEEK) - c.get(Calendar.DAY_OF_WEEK))));
		return "Ngày đầu tiên: " + fm.format(c1.getTime()) +", Ngày cuối cùng: "+ fm.format(c2.getTime());
	}
	
	private static String weekOfYear(Calendar c) {
		return "Đây là tuần thứ " + c.get(Calendar.WEEK_OF_YEAR) + " trong năm";
	}
	
	private static String afterSomeDays(Calendar c, int numberDay) {
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + numberDay);
		return fm.format(c1.getTime()) + " " + dayOfWeeks[c1.get(Calendar.DAY_OF_WEEK) - 1];
	}
	
	private static int myTimePass(Calendar c, Calendar myBirth) {
		GregorianCalendar leapYear = new GregorianCalendar();
		int yearNow = c.get(Calendar.YEAR);
		int yearPast = myBirth.get(Calendar.YEAR) + 1;
		
		int sumDays = myBirth.getActualMaximum(Calendar.DAY_OF_YEAR) - myBirth.get(Calendar.DAY_OF_YEAR);
		while(yearPast!=yearNow) {
			sumDays = sumDays + (leapYear.isLeapYear(yearPast) ? 366 : 365 );
			yearPast++;
			if(yearPast == yearNow) {
				sumDays += c.get(Calendar.DAY_OF_YEAR);
			}
		}
		return sumDays;
	}
}

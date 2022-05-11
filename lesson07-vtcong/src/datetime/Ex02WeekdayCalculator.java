package datetime;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import static utils.Utils.*;

public class Ex02WeekdayCalculator {
	public static void main(String[] args) {
		Calendar calendar = getIntance(1995,Calendar.SEPTEMBER,25);

		printDayNumberAndDayLefts(calendar);
		printWeekOfYear(calendar);
		printDayOfWeekNumber(calendar);
		printYear(calendar);
		printDayMonth(calendar);
		
	}
	
	
	private static Calendar getIntance(int year,int month,int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}
	
	private static void printDayNumberAndDayLefts(Calendar c) {
		long timenow = c.getTimeInMillis();
		Calendar newYear = getIntance(1995,Calendar.JANUARY, 1);
		long timeleft = newYear.getTimeInMillis();
		long time = timenow - timeleft;
		int dayOfyear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int leftDay = dayOfyear - (int)TimeUnit.MILLISECONDS.toDays(time);
		System.out.println("It's day number " + TimeUnit.MILLISECONDS.toDays(time) + " of the year , " + leftDay + " days left");
		
	}
	
	private static int  countWeekOfyear(Calendar c) {
		// Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		// ngày đầu tiên của năm 1/1/....thuộc thứ mấy : 5-CN : là thuộc tuần cũ không tính tuần mới 
		// ngày đầu tiên của năm thuộc t2->t4 là thuộc tuần mới 
		// LocalDate dateStartOfYear = LocalDate.of(date.getYear(), 1, 1);
		Calendar dateStartOfYear = getIntance(c.get(Calendar.YEAR), Calendar.JANUARY, 1);
		
		//int dayOfWeek = dateStartOfYear.getDayOfWeek().getValue();
		int dayOfWeek = dateStartOfYear.get(Calendar.DAY_OF_WEEK);
		//tính lại xem t2 của tuần tiếp theo là ngày bao nhiêu
		//dateStartOfYear = dateStartOfYear.plusDays(7-dayOfWeek+1);
		dateStartOfYear.add(Calendar.DAY_OF_MONTH, 7-dayOfWeek+1);
		// tính khoảng cách bao nhiêu ngày từ ngày t2 đầu tiên :
		long distanceTime = toEpochDay(c) - toEpochDay(dateStartOfYear);
		long dayOfYear = TimeUnit.MILLISECONDS.toDays(distanceTime);
		// tính ra số tuần
		int numberOfWeek  = (int)dayOfYear / 7 ;
		if(dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 4 ) {
			return numberOfWeek ; 
		}
		else {
			return numberOfWeek + 1 ; 
		}		
	}
	
	private static void printWeekOfYear(Calendar c) {
		long distance = countWeekOfyear(c);
		int totalWeek = c.getActualMaximum(Calendar.DAY_OF_YEAR) / 7 ;
		System.out.println("It's " + DayOfWeek.of(c.get(Calendar.DAY_OF_WEEK)-1) + " number " + distance + " out of " + totalWeek + " in " + c.get(Calendar.YEAR) );
	}
	
	private static int countDayOfMonth(Calendar c) {
		int count = 0;
		//LocalDate startDayOfMontn = LocalDate.of(date.getYear(), date.getMonth(), 1);
		Calendar startDayOfMonth = getIntance(c.get(Calendar.YEAR),Calendar.SEPTEMBER, 1);
		while (startDayOfMonth.before(c)) {
			startDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
			if (startDayOfMonth.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
				count++;
			}
		}
		return count;
	}
	
	private static void printDayOfWeekNumber(Calendar c) {
		int countDays = countDayOfMonth(c);
		System.out.println("It's " + DayOfWeek.of(c.get(Calendar.DAY_OF_WEEK)-1) + " number " + countDays);
	}
	
	private static void printYear(Calendar c) {
		System.out.println("Year " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days ");
	}
	
	private static void printDayMonth(Calendar c) {
		System.out.println(c.get(Calendar.MONTH) + 1 + " - " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}
	
	private static long toEpochDay(Calendar c) {
		return c.getTimeInMillis();
	}
	
	
	
	
	
}

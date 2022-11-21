package exercises;

import java.util.Calendar;

import common.WeekDay;

public class Ex03WeekDayAsString {
	public static void main(String[] args) {
		WeekDay[] wd = WeekDay.values();
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.NOVEMBER, 1);;
	
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of week: " + dowAsInt);
		
		System.out.println(wd[dowAsInt-1]);
	}
}

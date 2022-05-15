package localdatetime;

import java.time.LocalDate;
import java.util.Calendar;

import utils.DatetimeUtils;

public class Ex05DayCalculator {
	public static void main(String[] args) {
		// hôm nay ngày 5.5.2022 du an bat dau
		// thoi gian hoan thanh 110 ngày - khong tinh t7,cn,va ngay le
		// tìm in ra ngày ma  du an phai ban giao
		
		// Ideal
		// biet count chay , ngay hien tại, count < 110,
		// neu ko cn,t7,ngay le thì tăng cao
		Calendar[] holidays = getVnHoliday();
		Calendar running = getInstance(5,Calendar.MAY,2020);
		
		int executionDays = 110;
		int workedDays=0;
		while(workedDays <= 110) {
			int dayOfWeek = running.get(Calendar.DAY_OF_WEEK);
			if(dayOfWeek != Calendar.SATURDAY 
					&& dayOfWeek != Calendar.SUNDAY
					&& !contains(holidays, running)) {
				workedDays++;
			}
			running.add(Calendar.DATE, 1);
		}
		System.out.println("deadline: " + DatetimeUtils.calendarToString(running, "dd/MM/yyyy"));
	}
	
	private static boolean contains(Calendar[] holidays,Calendar running) {
		for(Calendar holiday:holidays) {
			if(holiday.equals(running)) {
				System.out.println("holiday ----> " + DatetimeUtils.calendarToString(running, "dd/MM/yyyy"));
				return true;
			}
		}
		return false;
	}
	
	private static Calendar[] getVnHoliday() {
		int year = 2020;
		return new Calendar[] {
				getInstance(1, Calendar.JANUARY, year),
				getInstance(23, Calendar.JANUARY, year),
				getInstance(24, Calendar.JANUARY, year),
				getInstance(25, Calendar.JANUARY, year),
				getInstance(26, Calendar.JANUARY, year),
				getInstance(27, Calendar.JANUARY, year),
				getInstance(28, Calendar.JANUARY, year),
				getInstance(29, Calendar.JANUARY, year),
				getInstance(2, Calendar.APRIL, year),
				getInstance(30, Calendar.APRIL, year),
				getInstance(01, Calendar.MAY, year),
				getInstance(02, Calendar.SEPTEMBER, year),
		};
	}
	private static Calendar getInstance(int day,int month,int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month,year);
		return c;
	}
}

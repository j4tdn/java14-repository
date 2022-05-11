package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static utils.Utils.*;

public class Ex03Caculator {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();

		printLastDayOfMonth(calendar);
		printWeekOfYear(calendar);
		printFirstDayAndLastDayOfWeek(calendar);
		printDayAfter(calendar2, 20);
		numberDayYouLive(getIntance(1999,Calendar.MAY,5));
	}

	private static void printLastDayOfMonth(Calendar c) {
		System.out.println(
				"The last day of " + (c.get(Calendar.MONTH) + 1) + " is " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	private static Calendar getIntance(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}

	private static int countWeekOfyear(Calendar c) {
		// Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		// ngày đầu tiên của năm 1/1/....thuộc thứ mấy : 5-CN : là thuộc tuần cũ không
		// tính tuần mới
		// ngày đầu tiên của năm thuộc t2->t4 là thuộc tuần mới
		// LocalDate dateStartOfYear = LocalDate.of(date.getYear(), 1, 1);
		Calendar dateStartOfYear = getIntance(c.get(Calendar.YEAR), Calendar.JANUARY, 1);

		// int dayOfWeek = dateStartOfYear.getDayOfWeek().getValue();
		int dayOfWeek = dateStartOfYear.get(Calendar.DAY_OF_WEEK);
		// tính lại xem t2 của tuần tiếp theo là ngày bao nhiêu
		// dateStartOfYear = dateStartOfYear.plusDays(7-dayOfWeek+1);
		dateStartOfYear.add(Calendar.DAY_OF_MONTH, 7 - dayOfWeek + 1);
		// tính khoảng cách bao nhiêu ngày từ ngày t2 đầu tiên :
		long distanceTime = toEpochDay(c) - toEpochDay(dateStartOfYear);
		long dayOfYear = TimeUnit.MILLISECONDS.toDays(distanceTime);
		// tính ra số tuần
		int numberOfWeek = (int) dayOfYear / 7;
		if (dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 4) {
			return numberOfWeek;
		} else {
			return numberOfWeek + 1;
		}
	}

	private static void printWeekOfYear(Calendar c) {
		long distance = countWeekOfyear(c);
		int totalWeek = c.getActualMaximum(Calendar.DAY_OF_YEAR) / 7;
		System.out.println("It's " + DayOfWeek.of(c.get(Calendar.DAY_OF_WEEK) - 1) + " number " + distance + " out of "
				+ totalWeek + " in " + c.get(Calendar.YEAR));
	}

	private static void printFirstDayAndLastDayOfWeek(Calendar c) {
		Calendar calendar = Calendar.getInstance();
		calendar = c;
		calendar.add(Calendar.DAY_OF_MONTH, -calendar.get(Calendar.DAY_OF_WEEK) + 2);
		print("the first day of week : ", "dd/MM/yyyy", calendar);
		calendar.add(Calendar.DAY_OF_MONTH, 6);
		print("the last day of week : ", "dd/MM/yyyy", calendar);
	}

	// Kiểm tra sau day ngày nữa là ngày nào, thứ mấy :
	private static void printDayAfter(Calendar c, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar = c;
		calendar.add(Calendar.DAY_OF_MONTH, day);
		print("the days after " + day + " is : ", "dd/MM/yyyy", calendar);
	}
	// kiem tra xem ban da song ? ngay
	private static void numberDayYouLive(Calendar birthday) {
		Calendar calendar = Calendar.getInstance();
		long miliseconds = toEpochDay(calendar) - toEpochDay(birthday);
		long totalDays = TimeUnit.MILLISECONDS.toDays(miliseconds);
		System.out.println("The number days, you live : " + totalDays + " days ");
	}

	private static long toEpochDay(Calendar c) {
		return c.getTimeInMillis();
	}

}

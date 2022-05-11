package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex03Calculator {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, 5, 9);
		printLastDayOfMonth(date);
		printFirstDayAndLastDayOfWeek(date);
		printWeekOfYear(date);
		printDayAfter(date, 20);
		numberDayYouLive(LocalDate.of(1999, 5, 5));

	}

	private static void printLastDayOfMonth(LocalDate date) {
		System.out.println("The last day of " + date.getMonth() + " is " + date.lengthOfMonth());
	}

	private static void printFirstDayAndLastDayOfWeek(LocalDate date) {
		// ngày đầu tiên và ngày cuối cùng của tuần hiện tại
		// ngày đầu tiên của tuần = ngày đầu tiên hiện tại - khoảng cách ngày : ex : t2 - > t4 : distance  = 2 
		// distance = 1 = values(t2);
		LocalDate startDate = date.minusDays(date.getDayOfWeek().getValue()-1);
		LocalDate endDate = startDate.plusDays(6);
		System.out.println("The first day of week : " + startDate + " , " + " the last day of week : " + endDate);
	}

	private static int countWeekOfyear(LocalDate date) {
		// Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		// ngày đầu tiên của năm 1/1/....thuộc thứ mấy : 5-CN : là thuộc tuần cũ không
		// tính tuần mới
		// ngày đầu tiên của năm thuộc t2->t4 là thuộc tuần mới
		LocalDate dateStartOfYear = LocalDate.of(date.getYear(), 1, 1);
		int dayOfWeek = dateStartOfYear.getDayOfWeek().getValue();
		// tính lại xem t2 của tuần tiếp theo là ngày bao nhiêu
		dateStartOfYear = dateStartOfYear.plusDays(7 - dayOfWeek + 1);
		// tính khoảng cách bao nhiêu ngày từ ngày t2 đầu tiên :
		long distanceTime = date.toEpochDay() - dateStartOfYear.toEpochDay();
		// tính ra số tuần
		int numberOfWeek = (int) distanceTime / 7;
		if (dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3) {
			return numberOfWeek;
		} else {
			return numberOfWeek + 1;
		}

	}

	private static void printWeekOfYear(LocalDate date) {
		long distance = countWeekOfyear(date);
		int totalWeek = date.lengthOfYear() / 7;
		System.out.println("It's " + date.getDayOfWeek() + " number " + distance + " out of " + totalWeek + " in "
				+ date.getYear());
	}

	// Kiểm tra sau day ngày nữa là ngày nào, thứ mấy :
	private static void printDayAfter(LocalDate date, int day) {
		date = date.plusDays(day);
		System.out.println("After " + day + " day is : " + date.getDayOfWeek());
	}
	//kiem tra xem ban da song bao nhieu ngay
	private static void numberDayYouLive(LocalDate birthday) {
		LocalDate date = LocalDate.now();
		long totalDays = date.toEpochDay() - birthday.toEpochDay() + 1;
		System.out.println("The number days, you live : " + totalDays + " days ");
	}
}

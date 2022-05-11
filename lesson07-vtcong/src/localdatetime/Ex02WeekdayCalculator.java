package localdatetime;

import java.time.LocalDate;

public class Ex02WeekdayCalculator {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1995, 9, 25);
		
		printDayNumberAndDayLefts(date);
		printWeekOfYear(date);
		printDayOfWeekNumber(date);
		printYear(date);
		printDayMonth(date);

	}

	private static void printDayNumberAndDayLefts(LocalDate date) {
		long lengthday = date.toEpochDay() - LocalDate.of(1995, 1, 1).toEpochDay() + 1;
		long leftday = date.lengthOfYear() - lengthday;
		System.out.println("It's day number : " + lengthday + " , " + leftday + " days left ");
	}
	
	private static int  countWeekOfyear(LocalDate date) {
		// Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		// ngày đầu tiên của năm 1/1/....thuộc thứ mấy : 5-CN : là thuộc tuần cũ không tính tuần mới 
		// ngày đầu tiên của năm thuộc t2->t4 là thuộc tuần mới 
		LocalDate dateStartOfYear = LocalDate.of(date.getYear(), 1, 1);
		int dayOfWeek = dateStartOfYear.getDayOfWeek().getValue();
		//tính lại xem t2 của tuần tiếp theo là ngày bao nhiêu
		dateStartOfYear = dateStartOfYear.plusDays(7-dayOfWeek+1);
		// tính khoảng cách bao nhiêu ngày từ ngày t2 đầu tiên :
		long distanceTime = date.toEpochDay() - dateStartOfYear.toEpochDay();
		// tính ra số tuần
		int numberOfWeek  = (int)distanceTime / 7 ;
		if(dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 ) {
			return numberOfWeek ; 
		}
		else {
			return numberOfWeek + 1 ; 
		}
		
	}
	
	private static void printWeekOfYear(LocalDate date) {
		long distance = countWeekOfyear(date);
		int totalWeek = date.lengthOfYear() / 7 ;
		System.out.println("It's " + date.getDayOfWeek() + " number " + distance + " out of " + totalWeek + " in " + date.getYear() );
	}
	
	

	private static int countDayOfMonth(LocalDate date) {
		int count = 0;
		LocalDate startDayOfMontn = LocalDate.of(date.getYear(), date.getMonth(), 1);
		while (startDayOfMontn.isBefore(date)) {
			startDayOfMontn = startDayOfMontn.plusDays(1);
			if (startDayOfMontn.getDayOfWeek() == date.getDayOfWeek()) {
				count++;
			}
		}
		return count;
	}
	
	private static void printDayOfWeekNumber(LocalDate date) {
		int countDays = countDayOfMonth(date);
		System.out.println("It's " + date.getDayOfWeek() + " number " + countDays);
	}

	private static void printYear(LocalDate date) {
		System.out.println("Year " + date.getYear() + " has " + date.lengthOfYear() + " days ");
	}
	
	private static void printDayMonth(LocalDate date) {
		System.out.println(date.getMonth() + " - " + date.getYear() + " has " + date.lengthOfMonth() + " days");
	}

}

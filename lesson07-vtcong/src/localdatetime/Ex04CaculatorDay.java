package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

import utils.Utils;

public class Ex04CaculatorDay {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, 11, 27);
		LocalDate[] dates = holiday(date);
		
		int count = 0;
		while (count < 110) {
			if (date.getDayOfWeek()!= DayOfWeek.SATURDAY && date.getDayOfWeek()!= DayOfWeek.SUNDAY  && !checkNationalDay(date,dates)) {
				count++;
			}
			date = date.plusDays(1);
			
		}
		System.out.println("date complete: " + date);

	}
	
	
	private static LocalDate[] holiday(LocalDate date) {
		return new LocalDate[] { LocalDate.of(date.getYear(), 9, 1),
								 LocalDate.of(date.getYear(), 9, 2),
								 LocalDate.of(date.getYear(), 1, 1),
								 LocalDate.of(date.getYear(), 1, 2),
								 LocalDate.of(date.getYear(), 1, 3),
								 LocalDate.of(date.getYear(), 1, 29),
								 LocalDate.of(date.getYear(), 1, 30),
								 LocalDate.of(date.getYear(), 1, 31),
								 LocalDate.of(date.getYear(), 2, 1),
								 LocalDate.of(date.getYear(), 2, 2),
								 LocalDate.of(date.getYear(), 2, 3)};
	}
	
	private static boolean checkNationalDay(LocalDate date, LocalDate[] dates) {
		for (LocalDate date2 : dates) {
			if (date2.equals(date)) {
				return true;
			}
		}
		return false;
	}
	
}

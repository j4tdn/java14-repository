package ex03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import utils.LocalDateTimeUtils;

public class Ex03Java08 {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Time now : " + LocalDateTimeUtils.toString(date));

		System.out.println("===========Ex01================");	
		LocalDateTime dateInNY = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("Time in New York now : " + LocalDateTimeUtils.toString(dateInNY));

		System.out.println("============Ex02===============");
		LocalDateTimeUtils.lastDayOfMonth(date);
		
		System.out.println("============Ex03===============");
		System.out.println("First and last day of week : " + LocalDateTimeUtils.getFirstDayAndLastDayThisWeek(d));
		
		System.out.println("============Ex04===============");
		System.out.println("The current week is the " + LocalDateTimeUtils.countWeek(date) + " week");
		
		System.out.println("============Ex05===============");
		System.out.println(
				"ADD days to the current day : " + LocalDateTimeUtils.toString(LocalDateTimeUtils.addD(date, 20)));
	
		System.out.println("============Ex06===============");
		System.out.println("Your age is : " + LocalDateTimeUtils.age(date, 2000));
	}
}

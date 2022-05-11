package localdatetime;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;


public class Ex01TheUltimateRelationshipCalculator {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		LocalDateTime startLoving = LocalDateTime.of(2021, 5, 11, 7,55 , 0);
		System.out.println("Have you guys broken up yet");
		
		System.out.println("0.Yes");
		System.out.println("1.We are in love");
		int brokenUp=sc.nextInt();
		if(brokenUp==0) {
			System.out.println(startLoving);
			return;
		}
		else {
			LocalDateTime endLoving=LocalDateTime.now();
			LocalDate startDate=startLoving.toLocalDate();
			LocalTime startTime=startLoving.toLocalTime();
			DayOfWeek day= startDate.getDayOfWeek();
			System.out.println(day);
			
			LocalDate endDate= endLoving.toLocalDate();
			LocalTime endTime= endLoving.toLocalTime();
			Duration duration= Duration.between(startTime, endTime);
			if(duration.isNegative()) {
				duration=duration.plusDays(1);
				endDate=endDate.minusDays(1);
			}
			Period period = Period.between(startDate, endDate);
			System.out.println(period.getYears()+" years \n"
							  +period.getMonths()+" months\n"
							  +period.getDays()+" days\n"
							  +duration.toHoursPart()+" hours\n"
							  +duration.toMinutesPart()+" minutes\n"
							  +duration.toSecondsPart()+" seconds");
		}
	}
}

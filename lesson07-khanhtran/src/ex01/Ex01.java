package ex01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	//private static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
    public static void main(String[] args) {
    	calculateDayTime();
	}
    
    public static void calculateDayTime() {
    	LocalDateTime dating = enterLocalDayTime("Enter your dating timeline:");
    	System.out.println("The date to start dating is " + dating.getDayOfWeek());
    	
    	System.out.println("Have you broke up? (True or False)");
    	boolean check = Boolean.parseBoolean(ip.next());
    	
    	LocalDateTime end = LocalDateTime.now();
    	if(check) {
    		end = enterLocalDayTime("Enter the date you broke up");
    		
    	} else {
    		System.out.println("Use current day at landmark");
    		end = LocalDateTime.now();
    	}
    	
    	if (dating.isAfter(end)) {
    		System.out.println("Time range is not valid");
    		return;
    	}
    	
    	LocalDate startDay = dating.toLocalDate();
    	LocalDate endDay = end.toLocalDate();
    	
    	LocalTime startTime = dating.toLocalTime();
    	LocalTime endTime = end.toLocalTime();
    	
    	Duration duration = Duration.between(startTime, endTime);
    	if(duration.isNegative()) {
    		endTime.plusHours(24);
    		endDay.minusDays(1);
    	}
    	Period period = Period.between(startDay, endDay);
    	System.out.println(period + " " + duration);
    }
    public static LocalDateTime enterLocalDayTime(String input) {
    	System.out.println(input);
    	System.out.print("Enter year: ");
    	int year = Integer.parseInt(ip.next());
    	System.out.print("Enter month: ");
    	int month = Integer.parseInt(ip.next());
    	System.out.print("Enter day: ");
    	int day = Integer.parseInt(ip.next());
    	System.out.print("Enter hour: ");
    	int hour = Integer.parseInt(ip.next());
    	System.out.print("Enter minute: ");
    	int minute = Integer.parseInt(ip.next());
    	System.out.print("Enter second: ");
    	int second = Integer.parseInt(ip.next());
    	return LocalDateTime.of(year, month, day, hour, minute, second);
    }
    
    
}

package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTime {
	public static void main(String[] args) {
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss");
		LocalDateTime now= LocalDateTime.now();
		System.out.println(df.format(now));
		
		LocalTime time=now.toLocalTime();
		LocalDate date=now.toLocalDate();
		System.out.println("date: "+date);
		System.out.println("time: "+time);
		
		LocalDate anotherDate=LocalDate.of(2020, 10, 05);
		LocalTime anotherTime=LocalTime.of(22, 15);
		LocalDateTime datetime=anotherDate.atTime(anotherTime);
		
	}
}

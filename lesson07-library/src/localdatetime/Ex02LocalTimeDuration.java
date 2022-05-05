package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class Ex02LocalTimeDuration {
	public static void main(String[] args) {
		DateTimeFormatter df= DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime start= LocalTime.now();
		System.out.println("start: "+df.format(start));
		LocalTime end = LocalTime.of(23, 18,20);
		System.out.println("end "+df.format(end));
		if(start.isBefore(end)) {
			Duration duration = Duration.between(start, end);
			System.out.println("duration: "+duration+"\n"
						+"hh: "+duration.toHoursPart()+"\n"
						+"mm: "+duration.toMinutesPart()+"\n"
						+"ss: "+duration.toSecondsPart()
						);
			
		}
		
	}
}

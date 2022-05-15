package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01LocalDatePeriod {
	public static void main(String[] args) {
		// format lai theo ngay/thang/nam
		DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(df.format(date));
		
		LocalDate anotherDate = LocalDate.of(2023, 8, 15);
		System.out.println(df.format(anotherDate));
		
		LocalDate stringToLDate =  LocalDate.parse("22/08/2018", df);
		stringToLDate = stringToLDate.plusDays(2)
									 .plus(3,ChronoUnit.DECADES);
		System.out.println("stringToDate : " + stringToLDate);
		
		
		
		if(date.isBefore(anotherDate)) {
			Period period = Period.between(date, anotherDate);
			System.out.println("Period : " + period);
			System.out.println(period.getYears()  + " years\n"
							 + period.getMonths() + " month\n"
						 	 + period.getDays()   + " Day");
		}
	}
}

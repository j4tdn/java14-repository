package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Ex01LocalDatePeriod {
/**
 * Period: LocalDate
 * @param args
 */
	public static void main(String[] args) {
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println("format date: "+df.format(date));
		
		LocalDate anotherDate= LocalDate.of(2022, 8, 18);
		System.out.println("anotherDate: "+ df.format(anotherDate));
		
		LocalDate stringToLocalDate=LocalDate.parse("22/08/2018", df);
		
		stringToLocalDate= stringToLocalDate.plusDays(2).plus(8,ChronoUnit.DAYS );
		System.out.println("stringToDate: "+stringToLocalDate);
		if(date.isBefore(anotherDate)) {
			Period period= Period.between(date, anotherDate);
			System.out.println(period);
			System.out.println("period: "+period.getYears()+" years"+"\n"
							
								+period.getMonths()+" months \n"+period.getDays()+" days");
		}
		
		}
		
		
}

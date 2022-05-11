package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Ex02WeekdayCalculator {
	public static void main(String[] args) {
		LocalDate ld= LocalDate.of(1995, 9, 25);
		System.out.println(ld.getDayOfWeek());
		int dayInYear=ld.lengthOfYear();
		System.out.println("Year "+ld.getYear()+" has "+dayInYear+" days");
		int dayInMonth=ld.getMonth().maxLength(); // day in month
		System.out.println(ld.getMonth()+" "+ld.getYear()+" has "+dayInMonth);
		
		int weekNow=0; // get week now
		
		LocalDate ldTemp=LocalDate.of(ld.getYear(), Month.JANUARY, 1);
		while(true) {
			if(ldTemp.isAfter(ld)) {
				break;
			}
			ldTemp=ldTemp.plusDays(7);
			weekNow++;
		}
		System.out.println(weekNow);
		
		int weekInYear=0; // get week a year now
		
		ldTemp=ldTemp.of(ld.getYear(), Month.JANUARY, 1);
		while(ldTemp.getYear()==ld.getYear()) {
			weekInYear++;
			ldTemp=ldTemp.plusDays(7);
		}
		System.out.println(weekInYear);
		System.out.println("It is "+ld.getDayOfWeek()+" number "+weekNow+" out of "+weekInYear+" in "+ld.getYear());
		
//		int dayNow=0; // get day now in year
//		ldTemp=ldTemp.of(ld.getYear(), Month.JANUARY, 1);
//		while(true) {
//			if(ldTemp.isAfter(ld)) {
//				break;
//			}
//			dayNow++;
//			ldTemp=ldTemp.plusDays(1);
//		}
//		System.out.println("day now in year: "+dayNow);
		System.out.println("It is day number "+ld.getDayOfYear()+" of the year, "+(ld.lengthOfYear()-ld.getDayOfYear())+" days left");
		
		ldTemp=ldTemp.of(ld.getYear(), ld.getMonth(), 1);
		int dayOfWeekInMonth=0;
		while( ld.getMonth().equals(ldTemp.getMonth())){
			if(ldTemp.getDayOfWeek().equals(ld.getDayOfWeek())) {
				dayOfWeekInMonth++;
				ldTemp=ldTemp.plusDays(7);
				continue;
			}
			ldTemp=ldTemp.plusDays(1);
		}
		System.out.println(dayOfWeekInMonth);
		ldTemp=ldTemp.of(ld.getYear(), ld.getMonth(), 1);
		int dayOfWeekInMonthNow=0;
		
		while(ldTemp.getMonthValue()<= ld.getMonthValue() && ldTemp.getMonth().equals(ld.getMonth())){
			
			if(ldTemp.getDayOfWeek().equals(ld.getDayOfWeek())) {
				dayOfWeekInMonthNow++;
				ldTemp=ldTemp.plusDays(7);
				continue;
			}
			ldTemp=ldTemp.plusDays(1);
		}
		System.out.println(dayOfWeekInMonthNow);
		System.out.println("It is "+ld.getDayOfWeek()+" number "+dayOfWeekInMonthNow+" out of "+dayOfWeekInMonth+" in "+ld.getMonth()+" "+ld.getYear());
		
	}
}		

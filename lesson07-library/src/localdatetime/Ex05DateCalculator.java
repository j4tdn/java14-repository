package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex05DateCalculator {
	public static void main(String[] args) {
		
		LocalDate now= LocalDate.now();
		int  count=0;
		// holiday push into array
		while(count<110) {
			if(now.getDayOfWeek()!=DayOfWeek.SATURDAY || now.getDayOfWeek()!=DayOfWeek.SUNDAY) {
				count++;
			}
			now=now.plusDays(1);
		}
		System.out.println(now);
	}
}

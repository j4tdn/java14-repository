package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex05DateCalculator {
	public static void main(String[] args) {
		
		LocalDate now= LocalDate.now();
		int  count=0;
		// holiday push into array
		while(count<110) {
			if(now.getDayOfWeek()!=DayOfWeek.SATURDAY && now.getDayOfWeek()!=DayOfWeek.SUNDAY) {
				LocalDate[] holidays= getHolydays();
				int check=0;
				for(int i=0;i<getHolydays().length;i++) {
					if(now.getDayOfMonth()==holidays[i].getDayOfMonth() && now.getMonthValue()==holidays[i].getMonthValue()) {
						check++;
					}
				}
				if(check==0) {
					System.out.println(count+":"+now);
					count++;
				}
			}
			now=now.plusDays(1);
		}
		System.out.println(now);
	}
	private static LocalDate[] getHolydays() {
		return new LocalDate[] {
				LocalDate.of(2022, 6, 21),
				LocalDate.of(2022,6,28),
				LocalDate.of(2022,9,1),
				LocalDate.of(2022,9,2),
				LocalDate.of(2022,9,23),
				LocalDate.of(2022,10,20),
				LocalDate.of(2022,10,31)
		};
	}
}

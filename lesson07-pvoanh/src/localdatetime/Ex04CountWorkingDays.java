package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex04CountWorkingDays {
	public static void main(String[] args) {
		LocalDate start= LocalDate.of(2022, 11, 27);
		getDeadLineDay(start, 110);
	}
	private static LocalDate getDeadLineDay(LocalDate startWorkingDate, int quantityWorkedDays) {
		int workedDays=0;
		while(workedDays<quantityWorkedDays){
			if(startWorkingDate.getDayOfWeek()!=DayOfWeek.SATURDAY 
				&& startWorkingDate.getDayOfWeek()!=DayOfWeek.SUNDAY
				&& !contains(getTetHolidays(), startWorkingDate)) {
				workedDays++;
				System.out.println(workedDays+": "+startWorkingDate);
			}
			startWorkingDate=startWorkingDate.plusDays(1);
		}
		return startWorkingDate;
	}
	private static LocalDate[] getTetHolidays() {
		return new LocalDate[] {
			LocalDate.of(2022,12,29),	
			LocalDate.of(2022,12,30),	
			LocalDate.of(2022,12,31),	
			LocalDate.of(2023,1,1),	
			LocalDate.of(2023,1,2),	
			LocalDate.of(2023,1,3),	
			LocalDate.of(2023,1,4),	
			LocalDate.of(2023,1,5)
		};
	}
	private static boolean contains(LocalDate[] tets, LocalDate date) {
		for(LocalDate tet:tets) {
			if(date.equals(tet)) {
				return true;
			}
		}
		return false;
	}
}

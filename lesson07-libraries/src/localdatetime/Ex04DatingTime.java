package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04DatingTime {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 4, 22, 18, 46, 20);
		
		LocalDateTime end = LocalDateTime.of(2020, 2, 17, 10, 10, 40);
		
		// Viet chuong trinh tim khoang tg 2 nguoi quen nhau
		// yeu cau kiem tra loi truoc khi xu ly
		// nam thang ngay h phut giay
		
		
		if(start.isBefore(end)) {
			
			LocalDate dateStart = start.toLocalDate();
			LocalDate dateEnd = end.toLocalDate();
			
			LocalTime timeStart = start.toLocalTime();
			LocalTime timeEnd = end.toLocalTime();
			
			Duration duration = Duration.between(timeStart, timeEnd);
			if(duration.isNegative()) {
				duration = duration.plusDays(1);
				dateEnd = dateEnd.minusDays(1);
			}
			
			System.out.println("duration :" + duration);
			
			Period periodDay = Period.between(dateStart, dateEnd);
			System.out.println("period: " + periodDay);

		}
		
		
	}
}

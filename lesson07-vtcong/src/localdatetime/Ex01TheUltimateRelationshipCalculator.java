package localdatetime;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("nhập ngày hẹn hò");
		System.out.print("năm : ");
		String year = input.nextLine();
		String month,day;
		do {
			System.out.print("tháng : ");
			month = input.nextLine();
		}

		while(Integer.parseInt(month)> 12 || Integer.parseInt(month) < 1 );
		do {
			System.out.print("ngày : ");
			day = input.nextLine();
		}
		while(Integer.parseInt(day)> 31 || Integer.parseInt(day) < 1 );

		
		

		LocalDate localDating = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		LocalTime timeDating = LocalTime.of(23, 0, 0);

		LocalDate presentDate = LocalDate.now();
		LocalTime presentTime = LocalTime.now();

		System.out.println("bạn đã chia tay chưa ? 1:yes or 0:no ");
		int breakUp = Integer.parseInt(input.nextLine());
		if (breakUp == 1) {
			System.out.println("nhập ngày hẹn hò");
			System.out.print("năm : ");
			String yearBreakUp = input.nextLine();
			String monthBreakUp,dateBreakUp;
			do {
				System.out.print("tháng : ");
				monthBreakUp = input.nextLine();
			}

			while(Integer.parseInt(monthBreakUp)> 12 || Integer.parseInt(monthBreakUp) < 1 );
			do {
				System.out.print("ngày : ");
				dateBreakUp = input.nextLine();
			}
			while(Integer.parseInt(dateBreakUp)> 31 || Integer.parseInt(dateBreakUp) < 1 );

			presentDate = LocalDate.of(Integer.parseInt(yearBreakUp), Integer.parseInt(monthBreakUp),
					Integer.parseInt(dateBreakUp));

		}

		if (localDating.isAfter(presentDate)) {
			System.out.println("don't have date");
			return;
		}
		System.out.println("ngày bắt đầu hẹn hò : " + localDating.getDayOfWeek());

		Period period = Period.between(localDating, presentDate);
		Duration duration = Duration.between(timeDating, presentTime);

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}

		System.out.println(period.getDays() + " \\ " + period.getMonths() + " \\ " + period.getYears());
		System.out.println(duration.toHoursPart() + " : " + duration.toMinutesPart() + " : " + duration.getSeconds());

	}
	
	

}
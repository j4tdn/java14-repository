package ex01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

//		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss");
		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("y 'years,' M 'months,' d 'days'");
		Scanner input = new Scanner(System.in);

		System.out.println("enter the dating begin:");

		LocalDateTime begindating = LocalDateTime.of(2019, 10, 10, 10, 20, 30);
//			System.out.println("begindating: "+ begindating);

		System.out.println("enter the dating status :1. Love || 0. Broken");

		LocalDate startDate = begindating.toLocalDate();
		LocalTime startTime = begindating.toLocalTime();
		int status = Integer.parseInt(input.nextLine());

		if (status == 1) {
			System.out.println("enter the date now");
			LocalDateTime now = LocalDateTime.now();
			LocalDate dateCurrent = now.toLocalDate();
			LocalTime timeCurrent = now.toLocalTime();
			Duration duration = Duration.between(startTime, timeCurrent);
			if (duration.isNegative()) {
				duration = duration.plusDays(1);
				dateCurrent = dateCurrent.minusDays(1);
			}
			Period period = Period.between(startDate, dateCurrent);

			System.out.println(period.getYears() + "/" + period.getMonths() + "/" + period.getDays() + " "
					+ duration.toHours() + ":" + duration.toMinutes() + ":" + duration.toMillis());

		} else {
			System.out.println("enter the date broken:");
			LocalDateTime broken = LocalDateTime.of(2021, 5, 10, 20, 15, 3);
			LocalDate dateBroken = broken.toLocalDate();
			LocalTime timeBroken = broken.toLocalTime();
			Duration duration = Duration.between(startTime, timeBroken);
			if (duration.isNegative()) {
				duration = duration.plusDays(1);
				dateBroken = dateBroken.minusDays(1);
			}
			Period period = Period.between(startDate, dateBroken);
			System.out.println(period + " " + duration);
		}

	}

}

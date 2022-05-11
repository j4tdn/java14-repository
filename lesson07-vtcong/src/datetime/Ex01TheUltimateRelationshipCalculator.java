package datetime;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static utils.Utils.*;

public class Ex01TheUltimateRelationshipCalculator {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		Calendar dateStart = datingDay();

		if (dateStart.after(now)) {
			System.out.println("Date Time Range is not valid !!!");
			return;
		}
		
		System.out.println("bạn đã chia tay ? yes : 1 no : 0");
		int aws = Integer.parseInt(input.nextLine());
		if(areYouBreak(aws)) {
			now = breakingDay();
		}

		print("start", "dd/MM/yyyy HH:mm:ss", dateStart);
		print("now", "dd/MM/yyyy HH:mm:ss", now);
		
		

		long startInMilliseconds = dateStart.getTimeInMillis();
		long nowInMilliseconds = now.getTimeInMillis();

		long duration = nowInMilliseconds - startInMilliseconds; // milliseconds

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		long remainingTime = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingTime);

		remainingTime -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingTime);

		remainingTime -= TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingTime);

		System.out.println("========================" + "\ndays: " + days + "\nhours: " + hours + "\nminutes: "
				+ minutes + "\nseconds: " + seconds);
	}

	private static Calendar datingDay() {
		Calendar datingDay = Calendar.getInstance();
		System.out.println("Thời gian hẹn hò");
		System.out.print("năm : ");
		String year = input.nextLine();
		String month, day;
		do {
			System.out.print("tháng : ");
			month = input.nextLine();
		}

		while (Integer.parseInt(month) > 12 || Integer.parseInt(month) < 1);
		do {
			System.out.print("ngày : ");
			day = input.nextLine();
		} while (Integer.parseInt(day) > 31 || Integer.parseInt(day) < 1);
		
		datingDay.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
		return datingDay;
	}
	
	private static Calendar breakingDay() {
		Calendar bearkingDay = Calendar.getInstance();
		System.out.println("Thời gian chia tay");
		System.out.print("năm : ");
		String breakYear = input.nextLine();
		String breakMonth, breakDay;
		do {
			System.out.print("tháng : ");
			breakMonth = input.nextLine();
		}

		while (Integer.parseInt(breakMonth) > 12 || Integer.parseInt(breakMonth) < 1);
		do {
			System.out.print("ngày : ");
			breakDay = input.nextLine();
		} while (Integer.parseInt(breakDay) > 31 || Integer.parseInt(breakDay) < 1);
		
		bearkingDay.set(Integer.parseInt(breakYear), Integer.parseInt(breakMonth)-1, Integer.parseInt(breakDay));
		return bearkingDay;
	}
	
	private static boolean areYouBreak(int aws) {
		return (aws == 1)? true: false;
	}
	

}

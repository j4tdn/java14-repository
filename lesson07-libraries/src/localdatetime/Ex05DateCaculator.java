package localdatetime;

import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex05DateCaculator {
	public static void main(String[] args) {
		// Hôm nay ngày 5/5/2022 - dự án bắt đầu
		// thời gian hoàn thành là 110 ngày - không tính
		// t7 cn và ngày lễ theo luật việt nam
		// tìm, in ra ngày mà dự án phải bàn giao

		LocalDate date = LocalDate.of(2022, 5, 5);
		// array holiday
		LocalDate[] dates = { LocalDate.of(2022, 9, 1), LocalDate.of(2022, 9, 2), LocalDate.of(2022, 9, 23) };

		int count = 0;
		System.out.println("date: " + date.getDayOfWeek());
		while (count < 110) {
			if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY) || checkNationalDay(date,dates)) {
				date = date.plusDays(1);
				continue;
			}
			System.out.println("date : " + date);
			date = date.plusDays(1);
			count++;
		}

	}

	private static boolean checkNationalDay(LocalDate date, LocalDate[] dates) {
		for (LocalDate date2 : dates) {
			return date.equals(date2);
		}
		return false;
	}
}

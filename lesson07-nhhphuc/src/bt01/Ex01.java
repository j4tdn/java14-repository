package bt01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	private static String[] dayOfWeeks = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư","Thứ Năm","Thứ Sáu","Thứ Bảy"};
	public static void main(String[] args) {
		
		Calendar start = Calendar.getInstance();
		start.set(Calendar.DAY_OF_MONTH, 15);
		start.set(Calendar.MONTH, 10);
		start.set(Calendar.YEAR, 2020);
		
		int check = 0;
		do {
			System.out.println("Trạng thái chia tay? ");
			System.out.println("1. Rồi");
			System.out.println("2. Chưa");
			System.out.print("Lựa chọn: ");
			check = Integer.parseInt(ip.nextLine());
			switch (check) {
				case 1:{
					System.out.println("Ngày chia tay: 22/01/2022");
					Calendar finish = Calendar.getInstance();
					finish.set(Calendar.DAY_OF_MONTH, 22);
					finish.set(Calendar.MONTH, 0);
					finish.set(Calendar.YEAR, 2022);
					
					calculate(start, finish);
					break;
				}
				case 2:{
					Calendar now  = Calendar.getInstance();
					calculate(start, now);
					break;
				}
				
			}
			
		}while(check!=0);
		
		
	}
	private static void calculate(Calendar start, Calendar finish) {
		int year = finish.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		int day = 365*year - start.get(Calendar.DAY_OF_YEAR) + finish.get(Calendar.DAY_OF_YEAR) ;
		
		System.out.println("Ngày bắt đầu hẹn hò là ngày: " + dayOfWeeks[start.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("Kéo dài: "+ ((int)day/365>0?day/365:"Chưa đủ 1") + " Năm " + day%365 + " Ngày (" + day + " ngày)");
		
	}
}
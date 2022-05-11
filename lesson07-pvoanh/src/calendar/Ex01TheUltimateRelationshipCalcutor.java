package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalcutor {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		Calendar start= Calendar.getInstance();
		start.set(2021, 5, 11, 7, 55, 0);
		Calendar end= Calendar.getInstance();
		int loving=sc.nextInt();
		if(loving ==0) {
			int day=start.get(Calendar.DAY_OF_WEEK);
			System.out.println(day);
		}
	}
}

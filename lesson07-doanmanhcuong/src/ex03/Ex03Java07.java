package ex03;

import java.util.Calendar;

import utils.DateUtils;

public class Ex03Java07 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Date now : " + DateUtils.toString(c.getTime()));
		System.out.println("TimeZone : " + c.getTimeZone().getID());
		System.out.println("TimeZone Name : " + c.getTimeZone().getDisplayName());

		System.out.println("===========Ex01================");
		Calendar cal = Calendar.getInstance();
		DateUtils.dateOfNY(cal);
		System.out.println("============Ex02===============");
		DateUtils.lastDayOfMonth(c);
		System.out.println("============Ex03================");
		DateUtils.FirstLastDaysInW(c);
		System.out.println("============Ex04===============");
		System.out.println("The current week is the " + DateUtils.countWeek(c) + " week");
		DateUtils.addH(c, 8);
		
		System.out.println("============Ex05===============");
		DateUtils.addD(c, 20);
		System.out.println("============Ex06===============");
		System.out.println("Your age is : "  + DateUtils.age(c, 2000));
	}




}

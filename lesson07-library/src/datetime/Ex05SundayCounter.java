package datetime;

import java.util.Calendar;

import utils.DateTimeUtils;
/**
 * Ex03: đêm xem có bn ngày cn
 * @author Oanhpv1008
 *
 */
public class Ex05SundayCounter {
	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();
		
		int total =countAmountOfSundays(c);
		System.out.println(total);
	}
	// 28.4.2022
	// first 1.4.2022- > 30.4.2022
	private static int countAmountOfSundays(Calendar c) {
		int  firstDayOfMonth=1;
		int lasDayOfMonth=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		Calendar startDate = setTime(c, firstDayOfMonth);
		
		Calendar endDate =setTime(c, lasDayOfMonth);
		endDate.add(Calendar.DAY_OF_MONTH, 1);
		DateTimeUtils.print("startDate", "dd/MM/yyyy", startDate);
		DateTimeUtils.print("endDate", "dd/MM/yyyy", endDate);
		int count=0;
		System.out.println(startDate.before(endDate));
		while (startDate.before(endDate)) {
			System.out.println("====");
			if(startDate.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
				DateTimeUtils.print("===>", "dd/MM/yyyy", startDate);
				count++;
				startDate.add(Calendar.DAY_OF_MONTH, 7);
			}
			else {
				startDate.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		return count;
	}
	private static Calendar setTime (Calendar c,int dayAsNbr) {
		Calendar rs= Calendar.getInstance();
		rs.setTime(c.getTime());
		rs.set(Calendar.DAY_OF_MONTH, dayAsNbr);
		return rs;
	}

}

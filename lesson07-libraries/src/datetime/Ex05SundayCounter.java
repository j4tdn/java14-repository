package datetime;

import java.util.Calendar;

import utils.DateTimeUtils;

public class Ex05SundayCounter {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("total" + countAmountOfSunday(c));
	}

	private static int countAmountOfSunday(Calendar c) {
		int firstDayOfMonth = 1;
		int lastDayOfMonth = c.getLeastMaximum(Calendar.DAY_OF_MONTH);

		Calendar startDate = setTime(c, firstDayOfMonth);
		Calendar endDate = setTime(c, lastDayOfMonth);
		endDate.add(Calendar.DAY_OF_MONTH,1);
		
		DateTimeUtils.print("Startday", "dd/MM/yyyy", startDate);
		
		DateTimeUtils.print("endday", "dd/MM/yyyy", endDate);
		

		int count = 0;
		while (startDate.before(endDate)) {
			if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				DateTimeUtils.print("=>", "dd/MM/yyyy", startDate);
				count++;
				startDate.add(Calendar.DAY_OF_MONTH, 7);
			} else {
				startDate.add(Calendar.DAY_OF_MONTH, 1);
			}
		}

		return count;
	}

	private static Calendar setTime(Calendar c, int dayAsNbr) {
		Calendar result = Calendar.getInstance();
		result.setTime(c.getTime());
		result.set(Calendar.DAY_OF_MONTH, dayAsNbr);
		return result;

	}
}

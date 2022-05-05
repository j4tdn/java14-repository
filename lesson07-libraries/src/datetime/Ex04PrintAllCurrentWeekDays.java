package datetime;

import java.util.Calendar;
import static utils.DateTimeUtils.*;

public class Ex04PrintAllCurrentWeekDays {

	// current date : 27.04
	// output : 24.04->30.04 US-UK

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 27);
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int dayofWeek = c.get(Calendar.DAY_OF_WEEK);
		int fdoWAswd = c.getFirstDayOfWeek();

//		int trueDayOfWeek = dayOfMonth + fdoW - dayofWeek;
//		System.out.println("first day of current week:" +trueDayOfWeek);

		// 24.04.2022
		Calendar fdow = Calendar.getInstance();
		fdow.setTime(c.getTime());
//		fdow.set(Calendar.DAY_OF_MONTH, trueDayOfWeek);

		fdow.add(Calendar.DAY_OF_MONTH, fdoWAswd - dayofWeek);
		print("fdow", "dd/MM/yyyy", fdow);

		for (int i = 1; i <= 6; i++) {
			fdow.add(Calendar.DAY_OF_MONTH, 1);
			print("fdocw", "dd/MM/yyyy E", fdow);
		}

	}
}

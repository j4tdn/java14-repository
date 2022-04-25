package datetime;

import java.security.Principal;
import java.util.Calendar;

import utils.DateTiemUtils;

public class Ex04PrintALLCurrentWeekDays {
	
	// 27 ->24-30 US
	//27 ->25-1 VN | FR
	public static void main(String[] args) {
		
		// so ngay thang ->arr
		// firstdayof, ngay
		//ngayf->7
		Calendar c= Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, 27);
		Calendar fdow= Calendar.getInstance();
		fdow.setTime(c.getTime());
		
		int dayOfMonth=c.get(Calendar.DAY_OF_MONTH);
		
		int dayOfWeek=c.get(Calendar.DAY_OF_WEEK);
		int fdowAswd=c.getFirstDayOfWeek();
		fdow.add(Calendar.DAY_OF_MONTH, fdowAswd-dayOfWeek);
		DateTiemUtils.print("fdocw", "dd/MM/yyyy", fdow);
		
		for(int  i=1;i<=6;i++) {
			fdow.add(Calendar.DAY_OF_MONTH, 1);
			DateTiemUtils.print("fdocw", "dd/MM/yyyy", fdow);
		}
		
		
		
	}

}

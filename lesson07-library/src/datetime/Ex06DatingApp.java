package datetime;

import java.sql.Time;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateTimeUtils;

public class Ex06DatingApp {
	public static void main(String[] args) {
		
		Calendar dateStart=getTime(2022, Calendar.MARCH, 20, 21, 10, 10);
		Calendar now=Calendar.getInstance();
		
		if(dateStart.after(now)) {
			return;
		}
		long startInMilliseconds= dateStart.getTimeInMillis();
		long nowInMilliseconds=now.getTimeInMillis();
		
		long duration=nowInMilliseconds-startInMilliseconds;
		long days=TimeUnit.MILLISECONDS.toDays(duration);
		
		long remainingTime= duration-TimeUnit.DAYS.toMillis(days);
		long hours=TimeUnit.MILLISECONDS.toHours(remainingTime);
		
		remainingTime-=TimeUnit.HOURS.toMillis(hours);
		long minutes= TimeUnit.MILLISECONDS.toMinutes(remainingTime);
		
		remainingTime-=TimeUnit.MINUTES.toMillis(minutes);
		long seconds=TimeUnit.MILLISECONDS.toSeconds(remainingTime);
		DateTimeUtils.print("startDate", "dd/MM/yyyy", dateStart);
		DateTimeUtils.print("now", "dd/MM/yyyy", now);
		
		System.out.println("============");
		System.out.println("days: "+days+"\n"+"hours: "+hours+"\n"+"minutes: "+minutes+"\n"+"seconds: "+seconds);
		
		
		
		
	}
	
	private static Calendar getTime(int year, int month,int date, int hour,int minute,int second) {
		Calendar c= Calendar.getInstance();
		c.set(year, month, date, hour, minute, second);
		return c;
	}
}

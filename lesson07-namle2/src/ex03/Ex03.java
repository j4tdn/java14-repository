package ex03;



import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

import common.WeekDay;

import static utils.DatetimeUtils.*;
public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		Calendar c = Calendar.getInstance();
		int choose = 0;
		
		
		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			switch (choose) {
			case 1:
				System.out.println("enter the id country");
				String timeZone = input.nextLine() ;
				displayTimezone(timeZone);
				break;
			case 2:
				
			    System.out.println("the last date of Month : " +  c.getMaximum(Calendar.DATE));
				
				break;
			case 3:
				int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
				int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
				int fdow = c.getFirstDayOfWeek();
				
				c.add(Calendar.DAY_OF_MONTH, fdow - dayOfWeek);
				print("firtday of Week", "yyyy/MM/dd", c);
				
				c.add(Calendar.DAY_OF_MONTH, 6);
				print("firtday of Week", "yyyy/MM/dd", c);
				break;
			case 4:
				
				int dateOfMonth = c.get(Calendar.DAY_OF_YEAR);
				System.out.println("số tuần hiện tại là :");
				int amountWeek = dateOfMonth / 7;
				
				System.out.println("date "+ dateOfMonth +" "+ amountWeek);
				
				break;
			case 5:
				WeekDay[] weekDays = WeekDay.values();
				
				
				
				
				c.add(Calendar.DAY_OF_MONTH, 20);
				print("time", "yyyy/MM/dd",c );
				int date = c.get(Calendar.DAY_OF_WEEK);
				
				System.out.println(date);
				System.out.println( "thứ "+ weekDays[date-1]);
				break;
			case 6:
				DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dateOfBirth = LocalDate.of(2001,1,23);
				LocalDate currentDays = LocalDate.now();
				if (dateOfBirth.isBefore(currentDays)) {
					Period period = Period.between(dateOfBirth, currentDays);
					System.out.println("period: " + period);
					System.out.println(period.getYears()  + " years\n"
							         + period.getMonths() + " months\n"
							         + period.getDays()   + " days");
					
				
				}
				
				
				
				
				break;
			default:
				break;
			}
			
		}while (choose != 0);
	   
	}
	
	public static void displayTimezone(String name )
	{
		 Calendar cal = Calendar.getInstance();
		    cal.setTimeZone(TimeZone.getTimeZone(name));
		     
		    System.out.println("Thời gian hiện tại  là " + 
		    	cal.get(Calendar.YEAR)+ "/" +
		    	cal.get(Calendar.MONTH)+ "/" +
		    	cal.get(Calendar.DAY_OF_MONTH)+ " " +
		        cal.get(Calendar.HOUR_OF_DAY) + ":" +
		        cal.get(Calendar.MINUTE) + ":" +
		        cal.get(Calendar.SECOND));
	}
	public static void showDateOfMonthActuar(Calendar c)
	{
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
	}
	
	public static void showMenu()
	{
		System.out.println("choose :");
		System.out.println("1.Xem thời gian hiện tại của quốc gia bất kỳ ");
		System.out.println("2.In ngày cuối cùng của tháng hiện tại ");
		System.out.println("3.Xem ngày đàu tiên và ngày cuối cùng của tuần hiện tại");
		System.out.println("4.Xem ngày hiện tại đang ở tuần thứ mấy trong năm");
		System.out.println("5.kiểm tra sau 20 ngày nữa là ngày nào , thứ mấy");
		System.out.println("6.Nhập vào ngày tháng năng sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày");
		System.out.println("0.thoát");
	}
}

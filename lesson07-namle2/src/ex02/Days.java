package ex02;

import java.util.Calendar;

public class Days {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1995, 7,20);
		long dateOfYear = c.DAY_OF_YEAR;
		long dateInYear = c.getActualMaximum(1995);
		System.out.println(dateInYear + ""+ dateOfYear);
	}
	
	public static void show()
	{
		
	}
	
}

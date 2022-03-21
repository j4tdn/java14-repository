package singleton;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();
		System.out.println(new SimpleDateFormat("dd/MM/yyyy;h:m:s").format(c.getTime()));
	}
}

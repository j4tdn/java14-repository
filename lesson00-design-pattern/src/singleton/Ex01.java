package singleton;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		//Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println("now: " +
				new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(c.getTime()));
	}
}

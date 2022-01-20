package demo;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to Java14 !!!");
		System.out.println("Today: "+LocalDate.now());
		// Show date in format of "Year-Month-Date"
		System.out.println("Time: "+LocalTime.now());
	}

}

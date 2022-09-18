package model;

import java.util.Arrays;
import java.util.List;

import bean.Customer;
import bean.Student;

public class DataModel {
	private DataModel() {

	}
	public static List<Student> getStudents() {
		return Arrays.asList(
				new Student("Le Na", "0164 728 9291", 22),
				new Student("Hoang Teo", "0164 592 9102",18),
				new Student("Van Duc", "0165 123 9134", 21),
				new Student("Trung Ti", "0133 123 9154", 19)
		);
	}
	
	public static List<Customer> getCustomers() {
		return Arrays.asList(
				new Customer("Le Na", "0164 728 9291", "Nam Cao"),
				new Customer("Hoang Teo", "0164 592 9102", "Da Nang"),
				new Customer("Van Duc", "0165 123 9134", "Hoa Khanh"),
				new Customer("Trung Ti", "0134 123 678", "Cam le")

		);
	}
}

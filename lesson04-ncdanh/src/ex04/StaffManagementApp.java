package ex04;

public class StaffManagementApp {

	public static void main(String[] args) {
		Director[] directors = initiateDirectors();
		Manager[] managers = initiateManagers();
		Employee[] employees = initiateEmployees();

		System.out.println("Staff information: ");
		for (Director director : directors) {
			System.out.println(director);
		}

		System.out.println("===============");

		for (Manager manager : managers) {
			System.out.println(manager);
		}

		System.out.println("===============");

		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static Director[] initiateDirectors() {
		return new Director[] { new Director("Anton", "23-05-1975", 2.5f, 0.5f) };
	}

	public static Manager[] initiateManagers() {
		return new Manager[] { new Manager("Susan", "13-02-1986", 1.5f, 30) };
	}

	public static Employee[] initiateEmployees() {
		return new Employee[] { new Employee("Daniel", "3-05-1995", 1.2f, Department.FINANCE),
				new Employee("Victor", "24-07-1992", 1.2f, Department.TECHNICAL) };
	}
	
}

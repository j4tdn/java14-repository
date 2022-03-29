package ex04;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		Person[] persons = inputPerson();

		for (Person person : persons) {
			System.out.println(person.toString());
		}
		calculationSalary(persons);
		for (Person person : persons) {
			System.out.println(person.getFullName() + " " + person.getSalary());
		}
	}

	public static Person[] inputPerson() {

		Person lead = new Lead("Anh", "10.04.2001", 0.7f, 0.8f);

		Person manager = new Manager("Buu", "01.01.2001", 2.8f, 15);

		Person employee1 = new Employee("Minh", "10.10.2000", 1.8f, "phong");
		Person employee2 = new Employee("Nhat", "07.07.1998", 2.1f, "ban");
		Person[] persons = new Person[] { lead, manager, employee1, employee2 };
		return persons;
	}

	public static void calculationSalary(Person[] persons) {
		for (Person person : persons) {
			person.calculationSalary();
		}

	}

}
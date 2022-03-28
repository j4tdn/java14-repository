package Ex04;

import java.util.Scanner;

public class AppEx04 {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Program();
	}

	public static void Program() {
		Personal[] personals = inputPersonal();
		int choice;
		do {
			System.out.println("=================================");
			System.out.println("1 .Hiển thị thông tin các nhân sự có trong công ty");
			System.out.println("2.Lương của nhân sự");
			System.out.println("3.Thoát chương trình");
			System.out.println("=================================");
			System.out.print("Lựa chọn của bạn : ");
			choice = input.nextInt();
			if (choice == 1) {
				for (Personal personal : personals) {
					System.out.println(personal.toString());
				}
			} else if (choice == 2) {
				calculationSalary(personals);
				for (Personal personal : personals) {
					System.out.println(personal.getFullName()+" "+personal.getSalary());
				}
			}
			else if(choice==3) {break;};
		} while (true);

	}

	public static Personal[] inputPersonal() {
		// thong tin giam doc
		Personal direction = new Direction("Hưng", "19/06/1999", 0.5f, 0.7f);
		// thong tin truong phong
		Personal manager = new Manager("Khoa", "05/06/1999", 2.8f, 200);
		// thong tin nhan vien
		Personal employee1 = new Employee("Công", "05/05/1999", 2.9f, "phòng ban");
		Personal employee2 = new Employee("Huynh", "14/07/1999", 2.9f, "phòng ban");
		Personal[] personals = new Personal[] { direction, manager, employee1, employee2 };
		return personals;
	}

	public static void calculationSalary(Personal[] personals) {
		for (Personal personal : personals) {
			personal.calculationSalary();
		}

	}
}

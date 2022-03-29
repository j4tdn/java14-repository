package package01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Student[] std = initialStudents();
		for (int i = 0; i < std.length; i++) {

			System.out.println(std[i]);
		}

		findPoinCenter(std);
		findPointBigger(std);
	}

	public static Student[] initialStudents() {
		Student s1 = new Student(412, "Nam Le", 10f, 9.5f);
		Student s2 = new Student(413, "Hoai Nhi", 6.0f, 5.0f);
		Student s3 = new Student();
		s3.input();
		return new Student[] { s1, s2, s3 };

	}

	public static void findPoinCenter(Student[] student) {
		System.out.println("Thong tin sinh  vien co diem TB > 8.5 :");
		for (int i = 0; i < student.length; i++) {

			if (student[i].mediumScore() > 8.5) {

				System.out.println(student[i]);
			}
		}

	}

	public static void findPointBigger(Student[] student) {
		System.out.println("Thong tin sinh  vien co diem LT > TH :");
		for (int i = 0; i < student.length; i++) {

			if (student[i].getTheorypoin() > student[i].getPracticepoin()) {

				System.out.println(student[i]);
			}
		}
	}

}

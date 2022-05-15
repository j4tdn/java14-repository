package ex01;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		Student student1 = new Student("102", "Nam", Classification.C);
		Student student2 = new Student("103", "Bảo", Classification.F);
		Student student3 = new Student("104", "Hoàng", Classification.D);
		Student student4 = new Student("105", "Nguyên", Classification.B);
		Student student5 = new Student("107", "Vũ", Classification.F);
		Student student6 = new Student("109", "Lan", Classification.A);
		Student student7 = new Student("202", "�?ạt", Classification.C);
		Student student8 = new Student("103", "Bảo", Classification.F);
		Student student9 = new Student("107", "Vũ", Classification.C);
		Student student10 = new Student("104", "Hoàng", Classification.B);

		Student[] students = { student1, student2, student3, student4, student5, student6, student7, student8, student9,
				student10 };

		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2021.");
		Student[] listStudents1 = getStudentTypeA(students, Classification.A);
		for (Student student : listStudents1) {
			System.out.println(student);
		}

		System.out.println("Danh sách sinh viên đã tham gia h�?c lại môn cấu trúc dữ liệu trong năm 2021.");
		Student[] listStudents2 = getStudentLearnMore(students);
		for (Student student : listStudents2) {
			System.out.println(student);
		}
	}

	public static Student[] getStudentTypeA(Student[] students, Classification classification) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.getClassification() == classification) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Student[] getStudentLearnMore(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		int index = 0;
		for (Student s : students) {
			if (contains(result, s)) {
				continue;
			}
			for (Student i : students) {
				if (s.equals(i)) {
					count++;
				}
			}
			if (count == 2) {
				result[index++] = s;
			}
			count = 0;
		}
		return Arrays.copyOfRange(result, 0, index);
	}

	private static boolean contains(Student[] students, Student student) {
		if (students.length == 0 || student == null) {
			return false;
		}
		for (Student s : students) {
			if (s == null) {
				break;
			}
			if (student.equals(s)) {
				return true;
			}
		}
		return false;
	}
}

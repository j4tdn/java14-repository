package Ex01;

import java.util.Scanner;

public class App {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Student sv1 = new Student(1, "Võ Thành Công", 7.9f, 8.1f);
		sv1.mediumScore();
		System.out.println(sv1.toString());

		Student sv2 = new Student(2, "Ngô Viết Quốc Hưng", 7.5f, 8.5f);
		sv2.mediumScore();
		System.out.println(sv2.toString());

		Student sv3 = new Student();
		inputInformation(sv3);
		sv3.mediumScore();
		System.out.println(sv3.toString());

		Student[] students = new Student[] { sv1, sv2, sv3 };
		// find student have meduim point > medium point 8.5
		Student studentMeduim = findStudentMediunPoint(students, 8.5f);
		if (studentMeduim != null) {
			System.out.println(studentMeduim.toString());
		} else {
			System.out.println("Not available");
		}

		// find student have point lt> point th;
		Student studentTheoBiggerPrac = findStudentTheoPointBiggerPracPoint(students);
		if (studentTheoBiggerPrac != null) {
			System.out.println(studentTheoBiggerPrac.toString());
		} else {
			System.out.println("Not available");
		}

	}

	public static Student inputInformation(Student student) {
		int id;
		String fullname;
		float theoPoint;
		float pracPoint;

		System.out.print("Input ID Student: ");
		id = Integer.parseInt(input.nextLine());
		System.out.print("Input fullname Student:");
		fullname = input.nextLine();
		System.out.print("Input theoretical point:");
		theoPoint = input.nextFloat();
		System.out.print("Input practice point:");
		pracPoint = input.nextFloat();

		student.setId(id);
		student.setFullName(fullname);
		student.setTheoreticalPoint(theoPoint);
		student.setPracticePoint(pracPoint);
		return student;
	}

	public static Student findStudentMediunPoint(Student[] students, float mediumPoint) {
		for (Student student : students) {
			if (student.getMediumPoint() > mediumPoint) {
				return student;
			}
		}
		return null;
	}

	public static Student findStudentTheoPointBiggerPracPoint(Student[] students) {
		for (Student student : students) {
			if (student.getTheoreticalPoint() > student.getPracticePoint())
				return student;
		}
		return null;
	}

}

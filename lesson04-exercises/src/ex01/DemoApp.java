package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		// initial data student1 and student2
		Student student1 = new Student(102200082, "Do Nguyen Anh", 9.0f, 8.5f);
		Student student2 = new Student(102190089, "Xuan He", 8.9f, 8.0f);
		// create data student3
		Student student3 = new Student();
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter student's id: ");
		student3.setId(ip.nextInt());
		ip.nextLine();
		System.out.println("Enter student's name: ");
		student3.setFullName(ip.nextLine());
		System.out.println("Enter student's theoretical point: ");
		student3.setTheoreticalPoint(ip.nextFloat());
		System.out.println("Enter student's practice points: ");
		student3.setPracticePoints(ip.nextFloat());

		
		Student[] students = {student1, student2, student3};
		
		System.out.println("Student information with GPA greater than 8.5: ");
		Student[] arrResult1 = findStudentByGradeScore(students);
		for(Student student: arrResult1) {
			System.out.println(student.toString());
		}
		
		System.out.println("information that students have higher theoretical points than practical points: ");
		Student[] arrResult2 = findStudentByComparition(students);
		for(Student student: arrResult2) {
			System.out.println(student.toString());
		}
		
		
	}

	private static Student[] findStudentByGradeScore(Student[] students) {
		Student[] arrResult = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.averageScore() > 8.5f) {
				arrResult[count++] = student;
			}
		}

		return Arrays.copyOfRange(arrResult, 0, count);
	}

	private static Student[] findStudentByComparition(Student[] students) {
		Student[] arrResult = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.getTheoreticalPoint() > student.getPracticePoints()) {
				arrResult[count++] = student;
			}
		}

		return Arrays.copyOfRange(arrResult, 0, count);
	}
}

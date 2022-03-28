package ex01;

import java.util.Scanner;

public class StudentInfoManagementSystem {

	public static void main(String[] args) {
		Student student1 = new Student(12456, "Nguyen Cong Danh", 8.0f, 6.0f);
		Student student2 = new Student(13567, "Nguyen Van A", 9.5f, 9.0f);
		
		Student student3 = new Student();
		initiateStudent(student3);
		
		Student[] students = { student1, student2, student3 };
		
		findStudentByGradeScore(students);
		System.out.println("=============");
		findStudentByComparition(students);
	}

	private static void initiateStudent(Student student) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter student's ID: ");
		student.setStudentId(input.nextInt());
		
		input.nextLine();
		System.out.println("Enter student's name:  ");
		student.setStudentName(input.nextLine());
		
		System.out.println("Enter student's programming score:  ");
		student.setProgrammingScore(input.nextFloat());
		
		System.out.println("Enter student's practice score:  ");
		student.setPracticeScore(input.nextFloat());
	}

	private static void findStudentByGradeScore(Student[] students) {
		for(Student student : students) {
			if(student.calculateGradePoint()>8.5) {
				System.out.println("Student that gets a grade score higher than 8.5: ");
				System.out.println(student.toString());
			}
		}
	}
	
	private static void findStudentByComparition(Student[] students) {
		for(Student student: students) {
			if(student.getProgrammingScore()>student.getPracticeScore()) {
				System.out.println("Student who gets programming score that's higher than practice score: ");
				System.out.println(student.toString());
			}
		}
	}

}

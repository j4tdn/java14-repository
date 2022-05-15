package package01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = getStudents();
		Student[] pointA = getStudentA(students);
		printStudents(pointA);
		System.out.println("==========================");
		Student[] result = getStudentF(students);
		printStudents(result);
	}
	private static Student[] getStudents() {
		return new Student[] { 
				new Student(102, "Nam", Enum.C), 
				new Student(103, "Bao", Enum.F), 
				new Student(104, "Hoang", Enum.D),
				new Student(105, "Nguyen", Enum.B),
				new Student(107, "Vu", Enum.F), 
				new Student(109, "Lan", Enum.A),
				new Student(202, "Dat", Enum.C),
				new Student(107, "Vu", Enum.C), 
				new Student(104, "Hoang", Enum.C), 
				};
	}
	
	private static Student[] getStudentA(Student[] students) {
		Student[] result = new Student[students.length];
		int i = 0;
		for (Student student : students) {
			if (student.getPoint().equals(Enum.A)) {
				result[i++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
	
	private static Student[] getStudentF(Student[] students) {
		Student[] result = new Student[students.length];
		int i = 0;
		for (Student student : students) {
			if (student.getPoint().equals(Enum.F)) {
				result[i++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
	
	private static void printStudents(Student[] students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}
}

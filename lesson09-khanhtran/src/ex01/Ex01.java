package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = createStudent();
		Student[] studentsReachA = getStudentReachA(students);
		for(Student student: studentsReachA) {
			System.out.println(student);
		}
		System.out.println("=================================");
		Student[] studentsReachF = getStudentReachF(students);
		for(Student student: studentsReachF) {
			System.out.println(student);
		}
	}
	
	private static Student[] createStudent() {
		Student[] students =
			{
			new Student(102, "Nam", Ranking.C),
			new Student(103, "Bảo", Ranking.F),
			new Student(104, "Hoàng", Ranking.D),
			new Student(105, "Nguyên", Ranking.B),
			new Student(107, "Vũ", Ranking.F),
			new Student(109, "Lan", Ranking.A),
			new Student(202, "Đạt", Ranking.C),
			new Student(103, "Bảo", Ranking.F),
			new Student(107, "Vũ", Ranking.C),
			new Student(104, "Hoàng", Ranking.B)
			};
		return students;
	}
	
	private static Student[] getStudentReachA(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student: students) {
			if(student.getRank()==Ranking.A) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Student[] getStudentReachF(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student: students) {
			if(student.getRank()==Ranking.F) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}

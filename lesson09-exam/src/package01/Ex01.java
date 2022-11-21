package package01;

import java.util.Arrays;

import bean.Student;
import common.Rank;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = findAll();
		Student[] studentsByRank = 	findStudents(students, Rank.A);
		System.out.println(Arrays.toString(studentsByRank));

	}
	private static Student[] findResignedStudent(Student[] students) {
		Student[] result = new Student[students.length];
		boolean[] resignedFlags = new boolean[students.length];
		
		
		return result;
	}
	
	private static Student[] findStudents(Student[] students, Rank filterRank) {
		Student[] result = new Student[students.length];
		int run = 0;
		for(Student student: students) {
			if(filterRank.equals(student.getRank())) {
				result[run++] = student;
			}			
		}
		return Arrays.copyOfRange(result, 0, run);		
	}
	
	private static Student[] findAll() {
		return new Student[]{
				new Student(102, "Nam",Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D),
				new Student(105, "Nguyên", Rank.B),
				new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A),
				new Student(202, "Đạt", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C),
				new Student(104, "Hoàng", Rank.B)
			};
	}
}

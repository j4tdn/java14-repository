package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CreateData {
	private CreateData() {

	}

	public static Student[] createData() {
		Graded graded = null;
		Student[] students = { 
				new Student(102, "Nam", graded.C), 
				new Student(103, "Bảo", graded.F),
				new Student(104, "Hoàng", graded.D), 
				new Student(105, "Nguyên", graded.B),
				new Student(107, "Vũ", graded.F), 
				new Student(109, "Lan", graded.A), 
				new Student(202, "Đạt", graded.C),
				new Student(103, "Bảo", graded.F), 
				new Student(107, "Vũ", graded.C),
				new Student(104, "Hoàng", graded.B) };

		return students;
	}

	public static Student[] getStudent(Student[] students, String grade) {
		Student[] studentGrAs = new Student[students.length];
		Graded graded = null;
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGraded().equals(grade)) {
				studentGrAs[count].setIdStudent(students[i].getIdStudent());
				studentGrAs[count].setNameStudent(students[i].getNameStudent());
				studentGrAs[count].setGraded(students[i].getGraded());
				count++;
			}
		}
		return Arrays.copyOfRange(studentGrAs, 0, count);
	}

}

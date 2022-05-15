package ex01;

/**
 *
 * Bài 1(30đ): Trong năm 2021 có N sinh viên khoa CNTT đăng ký học phần cấu trúc
 * dữ liệu. Thông tin mỗi sinh viên được lưu trữ tại hệ thống gồm: Mã sinh viên,
 * Họ tên, Xếp loại Xếp loại học lực được lưu trong Enum với các giá trị: A, B,
 * C, D, E, F Với sinh viên có học lực loại F bắt buộc phải đăng ký học lại.
 * 
 * 
 * Tìm danh sách sinh viên từng đạt loại A trong năm 2021. 
 * Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.
 *
 */
public class Demo {
	public static void main(String[] args) {
		Student[] students = { new Student("102", "Nam", Point.C), new Student("104", "Hoàng", Point.D),
				new Student("109", "Lan", Point.A), new Student("103", "Bảo", Point.F),
				new Student("105", "Nguyên", Point.B), new Student("107", "Vũ", Point.F),
				new Student("103", "Bảo", Point.F), new Student("202", "Đạt", Point.C),
				new Student("107", "Vũ", Point.C), new Student("193", "Bảo", Point.B),
				new Student("104", "Hoàng", Point.B) };
		Student[] studentsA = studentsGetA(students);
		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2021: ");
		printStudents(studentsA);
		System.out.println("----------------------------");
		Student[] studensLearnAgain = getStudensLearnAgain(students);
		System.out.println("danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021: ");
		printStudents(studensLearnAgain);

	}

	private static Student[] studentsGetA(Student[] students) {
		Student[] arrStudentGetA = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.getLevel() == Point.A) {
				arrStudentGetA[count++] = student;
			}
		}
		return arrStudentGetA;
	}

	private static Student[] getStudensLearnAgain(Student[] students) {
		Student[] arrGetStudenLearnAgain = new Student[students.length];
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (!check(i, students)) {
				for (int j = 0; j < students.length; j++) {
					if (students[i].getId() == students[j].getId() && i != j) {
						arrGetStudenLearnAgain[count++] = students[i];
					}
				}
			}
		}

		return arrGetStudenLearnAgain;
	}

	private static boolean check(int i, Student[] students) {
		for (int j = 0; j < i; j++) {
			if (students[j].getId() == students[i].getId()) {
				return true;
			}
		}
		return false;
	}

	private static void printStudents(Student[] students) {
		for (Student s : students) {
			if (s != null) {
				System.out.println(s);
			}
		}
	}
}
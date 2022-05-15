package Ex01;

public class StudenTest {	
	public static void main(String[] args) {
		Student[] student = {
					new Student(102, "Nam", "C"),
					new Student(106, "Bảo", "F"),
					new Student(104, "Hoàng", "D"),
					new Student(105, "Nguyên", "B"),
					new Student(107, "Vũ", "F"),
					new Student(109, "Lan", "A"),
					new Student(202, "Đạt", "C"),
					new Student(103, "Bảo", "F"),
					new Student(107, "Vũ", "C"),
					new Student(104, "Hoàng", "B")
		};
		getStudentRankA(student);
		getStudentRankF(student);
	}
	public static  void getStudentRankA(Student[] students) {
		for(Student student : students) {
			if(student.getRank() == "A") {
				 System.out.println("Danh sach sinh vien dat diem A : " + student);
			}
		}
    }
	public static  void getStudentRankF(Student[] students) {
		for(Student student : students) {
			if(student.getRank() == "F") {
				 System.out.println("Danh sach sinh vien dat diem F : " + student);
			}
		}
    }
}

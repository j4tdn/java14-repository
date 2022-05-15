package bt01;

public class Main {
	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam",    Mark.C),
				new Student(103, "Bảo",    Mark.F),
				new Student(104, "Hoàng",  Mark.D),
				new Student(105, "Nguyên", Mark.B),
				new Student(107, "Vũ",     Mark.F),
				new Student(109, "Lan",    Mark.A),
				new Student(202, "Đạt",    Mark.C),
				new Student(103, "Bảo",    Mark.F),
				new Student(107, "Vũ",     Mark.C),
				new Student(104, "Hoàng",  Mark.B)
			};
		System.out.println("Sinh vien co diem A: ");
		Student[] aStudents = getAStudent(students);
		for(Student aS:aStudents) {
			System.out.println(aS.toString());
		}
		
		System.out.println("Sinh vien co diem F phai hoc lai: ");
		Student[] fStudents = getAStudent(students);
		for(Student fS:fStudents) {
			System.out.println(fS.toString());
		}
		
	}
	
	public static Student[] getAStudent(Student[] students) {
		int count = 0;
		Student[] std = new Student[count];
		//for (Student s : students) {
		for(int i=0; i<students.length; i++) {
			if(students[i].getMark()==Mark.A) {
				std[count] = students[i];
				count++;
			}
		}
		return std;
	}
	
	public static Student[] getFStudent(Student[] students) {
		int count = 0;
		Student[] std = new Student[count];
		//for (Student s : students) {
		for(int i=0; i<students.length; i++) {
			if(students[i].getMark()==Mark.F) {
				std[count] = students[i];
				count++;
			}
		}
		return std;
	}
}

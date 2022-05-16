package Ex01;

import static Ex01.Point.*;

import java.util.Arrays;
public class App {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getStudentHaveAPoint(getStudent())));
		System.out.println(Arrays.toString(getStudentHaveFPoint(getStudent())));
	}
	
	private static Student[] getStudentHaveFPoint(Student []students) {
		Student[] rs= new Student[students.length];
		int i=0;
		for(Student st:students) {
			if(st.getPoint().equals(F)) {
				rs[i++]=st;
			}
		}
		return Arrays.copyOfRange(rs, 0, i);
	}
	private static Student[] getStudentHaveAPoint(Student []students) {
		Student[] rs= new Student[students.length];
		int i=0;
		for(Student st:students) {
			if(st.getPoint().equals(A)) {
				rs[i++]=st;
			}
		}
		return Arrays.copyOfRange(rs, 0, i);
	}
	private static Student[]  getStudent() {
		return new Student[] {
				
					new Student(102, "Nam", C),
					new Student(103, "Bảo", F),
					new Student(104, "Hoàng", D),
					new Student(105, "Nguyên", B),
					new Student(107, "Vũ", F),
					new Student(109, "Lan", A),
					new Student(202, "Đạt", C),
					new Student(103, "Bảo", F),
					new Student(107, "Vũ", C),
					new Student(104, "Hoàng", B)
					
		};
	}
}

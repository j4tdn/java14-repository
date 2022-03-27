package ex01;

import java.util.Arrays;

public class App {
	public static void main(String [] args) {
		Student sv1= new Student(1,"Pham Van Oanh", 6.3f, 2.4f);
		Student sv2= new Student(2,"Ngo Si Duc", 9.1f, 8.2f);
		Student sv3= new Student();
		sv3.setStudentId(3);
		sv3.setName("La Van Toan");
		sv3.setLtPoint(8.9f);
		sv3.setThPoint(9.2f);
		Student[] students= {sv1,sv2,sv3};
		
		Student [] rs1= avgGreaterThan85(students);
		for(Student student: rs1) {
			System.out.println(student);
		}
		System.out.println("================");
		Student [] rs2= ltPointGreaterThanthPoint(students);
		for(Student student: rs2) {
			System.out.println(student);
		}
		
		
	}
	private static Student[] avgGreaterThan85(Student [] students){
		Student [] rs= new Student [students.length];
		int i=0;
		for(Student student:students) {
			if(student.avgPoint()>8.5) {
				rs[i++]=student;
			}
		}
		return Arrays.copyOfRange(rs, 0, i);
	}
	private static Student[] ltPointGreaterThanthPoint(Student [] students){
		Student [] rs= new Student [students.length];
		int i=0;
		for(Student student:students) {
			if(student.getLtPoint()>student.getThPoint()) {
				rs[i++]=student;
			}
		}
		return Arrays.copyOfRange(rs, 0, i);
	}
}

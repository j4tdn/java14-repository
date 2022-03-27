import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Student s1 = new Student(01, "Nguyen Huu Hong Phuc", 9, 9);
		Student s2 = new Student(02, "Nguyen Van A", 9, 7);
		Student s3 = new Student();
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		enterInformation(s3);
		getStudentHasMore8Dot5(studentList);
		getStudentHasTMMoreThanPM(studentList);
	}
	
	public static void enterInformation(Student s) {
		Scanner sc = new Scanner(System.in);
//		int id = sc.nextInt();
//		String name = sc.next();
//		float tM = sc.nextFloat();
//		float pM = sc.nextFloat();
//		s3.setId(id);
//		s3.setName(name);
//		s3.setPracticalMark(pM);
//		s3.setTheoreticalMark(tM);
		
		/* con nen long nhap tu ban phim vao setter khong */
		System.out.println("Please enter: ");
		System.out.print("ID: ");				s.setId(sc.nextInt());			
		System.out.print("Full Name: ");		s.setName(sc.next().toString()); 
		System.out.print("Theoretical Mark: "); s.setTheoreticalMark(sc.nextFloat());  /*VIET dai koo duoc*/
		System.out.print("Pratical Mark: ");    s.setPracticalMark(sc.nextFloat());
	}
	
	public static void getStudentHasMore8Dot5(ArrayList<Student> studentList) {
		System.out.println("-----------------------------------------");
		System.out.println("Student who has mark more than 8.5 is: ");
		for(Student s : studentList) {
			if(s.averageMark() > 8.5) {
				System.out.println("+ " + s.name + " with " + s.averageMark());
			}
		}
	}
	
	public static void getStudentHasTMMoreThanPM(ArrayList<Student> studentList) {
		System.out.println("-----------------------------------------");
		System.out.println("Student who has Theoretical Mark more than Pratical Mark is: ");
		for(Student s : studentList) {
			if(s.getTheoreticalMark() > s.getPracticalMark()) {
				System.out.println("+ " + s.name + " with " + s.getTheoreticalMark() + " : " + s.getPracticalMark());
			}
		}
	}
}

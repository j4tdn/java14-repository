package Ex01;

public class Manage {
public static void main(String[] args) {
	Student studentOne = new Student(123,"Hoang",8.5f,9f);
	Student studentTwo = new Student(234,"Vu",7f,8f);
	Student studentThree = new Student();
	studentThree.setMSSV(135);
	studentThree.setName("Nguyen");
	studentThree.setTH(8f);
	studentThree.setLT(7.5f);
	studentOne.setResult();
	studentTwo.setResult();
	studentThree.setResult();
	Student[] students = new Student[] {
			studentOne,studentTwo,studentThree
	};
 Student a	= findPoint(students)  ;
if(a != null) {	
 System.out.println(a.getName());
}else {
	System.out.println("No");
}
}
public static Student findPoint(Student[] students) {
	for (Student student : students) {
		if(student.getLT()> student.getTH()) {
			return student;
		}
	}
	return null;
}
}

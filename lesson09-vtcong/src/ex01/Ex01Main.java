package ex01;

import static ex01.CreateData.*;

public class Ex01Main {
	public static void main(String[] args) {

		Student[] students = createData();
		
		Student[] studentGradedAs = getStudent(students,"A");
		Student[] studentGradedFs = getStudent(students,"F");		
		
	}
}

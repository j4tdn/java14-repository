package ex01;

public class Testing {
	
	
    public static void main(String[] args) {
		Student std1 = new Student("S001", "Tran Trong Khanh", 8, 7);
		Student std2 = new Student("S002", "Ho Van Thuong", 9, 10);
		Student std3 = new Student();
		std3.setAttribute();
		Student[] test = {std1, std2, std3};
		Student[] temp = Student.getStudent(test, 8.5f);
		for(Student student: temp) {
			System.out.println(student);
		}
		System.out.println("==============================");
		Student[] temp2 = Student.getStudent2(test);
		for(Student student: temp2) {
			System.out.println(student);
		}
	}
}

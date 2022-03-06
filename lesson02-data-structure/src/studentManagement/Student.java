package studentManagement;

public class Student {
	public int id;
	public String fullName;
	public int age;
	public String faculty;

	public Student(int id, String fullName, int age, String faculty) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return this.id + ", " + this.fullName + ", " + this.age + ", " +this.faculty;
	}
}

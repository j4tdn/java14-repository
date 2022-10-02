package ex05;

public class Student {
	private int id;
	private String name;
	private double gpa;
	private String gender;

	public Student() {

	}

	public Student(int id, String name, double gpa, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getgpa() {
		return gpa;
	}

	public void setMark(double mark) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + gpa + ", gender=" + gender + "]";
	}

}

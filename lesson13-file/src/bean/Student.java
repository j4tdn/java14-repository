package bean;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 7757761221743221278L;
	private transient String fullname;
	private String phone;
	private int age;

	public Student(String name, String phone, int age) {
		this.fullname = name;
		this.phone = phone;
		this.age = age;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toLine() {
		return String.join(", ", getFullname(), getPhone(), getAge() + "\n");
	}

	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", phone=" + phone + ", age=" + age + "]";
	}

}

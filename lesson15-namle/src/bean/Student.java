package bean;

import java.util.Objects;

public class Student {
	private String id;
	private String fullname;
	private double score;
	private String gender;
	
	public Student() {
	}
	
	public Student(String id, String fullname, double score, String gender) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.score = score;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getfullname() {
		return fullname;
	}
	
	public void setfullname(String fullname) {
		this.fullname = fullname;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static Student toline(String line) {
		String[] elements = line.split(", ");
		if (elements.length != 4) {
			return null;
		}
		return new Student(elements[0], elements[1], 
				Double.parseDouble(elements[2]), elements[3]);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student that = (Student)obj;
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", score=" + score + ", gender=" + gender + "]";
	}
}
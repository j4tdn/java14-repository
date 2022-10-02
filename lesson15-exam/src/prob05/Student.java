package prob05;

import java.util.Objects;

public class Student {
	private String studentID;
	private String fullName;
	private double mediumScore;
	private String gender;

	public Student() {
		
	}

	public Student(String lines) {
		String[] elements = lines.trim().split(",\\s+");

		if (elements.length == 4) {
			this.studentID = elements[0];
			this.fullName = elements[1];
			this.mediumScore = Double.parseDouble(elements[2]);
			this.gender = elements[3];
		}
	}
	
	public Student(String studentID, String fullName, double mediumScore, String gender) {
		super();
		this.studentID = studentID;
		this.fullName = fullName;
		this.mediumScore = mediumScore;
		this.gender = gender;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getMediumScore() {
		return mediumScore;
	}

	public void setMediumScore(double mediumScore) {
		this.mediumScore = mediumScore;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", fullName=" + fullName + ", mediumScore=" + mediumScore
				+ ", gender=" + gender + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Student)) {
			return false;
		}
		Student that = (Student) o;
		return getStudentID() == that.getStudentID() && getFullName() == that.getFullName()
				&& getMediumScore() == that.getMediumScore() && getGender() == that.getGender();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getStudentID());
	}

}
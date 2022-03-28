package ex01;

public class Student {

	private int studentId;
	private String studentName;
	private float programmingScore; // diem LT
	private float practiceScore; // diem TH

	public Student() {
	}

	public Student(int studentId, String studentName, float programmingScore, float practiceScore) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.programmingScore = programmingScore;
		this.practiceScore = practiceScore;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getProgrammingScore() {
		return programmingScore;
	}

	public void setProgrammingScore(float programmingScore) {
		this.programmingScore = programmingScore;
	}

	public float getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(float practiceScore) {
		this.practiceScore = practiceScore;
	}

	public float calculateGradePoint() {
		return (this.programmingScore + this.practiceScore) / 2;
	}

	@Override
	public String toString() {
		return "Student's name: "+studentName+ ", student's ID: "+
	studentId+ ", student's score by programming: "+
	programmingScore+ " ,student's practice score:  "+practiceScore;
	}
}

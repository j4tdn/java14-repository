package ex01;

public class Student {
	private int studentId;
	private String name;
	private float ltPoint;
	private float thPoint;
	public Student() {
		
	}
	public Student(int studentId, String name, float ltPoint, float thPoint) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.ltPoint = ltPoint;
		this.thPoint = thPoint;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getLtPoint() {
		return ltPoint;
	}
	public void setLtPoint(float ltPoint) {
		this.ltPoint = ltPoint;
	}
	public float getThPoint() {
		return thPoint;
	}
	public void setThPoint(float thPoint) {
		this.thPoint = thPoint;
	}
	public float avgPoint() {
		return (this.ltPoint + this.thPoint)/2;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", ltPoint=" + ltPoint + ", thPoint=" + thPoint
				+"avrPoint="+avgPoint()+ "]";
	}
	
	
}

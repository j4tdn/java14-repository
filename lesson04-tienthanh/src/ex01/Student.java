package ex01;

public class Student {
	private int id;
	private String name;
	private float theoreticalPoint;
	private float practicePoint;
	public Student() {
		this.id=0;
		this.theoreticalPoint=0;
		this.practicePoint=0;
		this.name="";
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
	public float gettheoreticalPoint() {
		return theoreticalPoint;
	}
	public void settheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}
	public float getpracticePoint() {
		return practicePoint;
	}
	public void setpracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	@Override
	public String toString() {
		 return String.format("%-5d %-20s %-20.2f %-20.2f %-20.2f ",id,name,theoreticalPoint,practicePoint,Average());
	}
	public Student(int id, String name, float theoreticalPoint, float practicePoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}
	public float Average () {
		return (float)(theoreticalPoint+practicePoint)/2;
	}
}
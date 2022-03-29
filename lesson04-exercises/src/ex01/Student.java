package ex01;

public class Student {
	private int id;
	private String fullName;
	private float theoreticalPoint;
	private float practicePoints;

	public Student() {

		this.id = 0;
		this.fullName = null;
		this.theoreticalPoint = 0;
		this.practicePoints = 0;
	}

	public Student(int id, String fullName, float theoreticalPoint, float practicePoints) {
		this.id = id;
		this.fullName = fullName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoints = practicePoints;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoints() {
		return practicePoints;
	}

	public void setPracticePoints(float practicePoints) {
		this.practicePoints = practicePoints;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", theoreticalPoint=" + theoreticalPoint
				+ ", practicePoints=" + practicePoints + "]";
	}
	
	public float averageScore() {
		return (this.theoreticalPoint + this.practicePoints)/2;
	}


}

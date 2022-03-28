package Ex01;

public class Student {
	private int id;
	private String fullName;
	private float theoreticalPoint;
	private float practicePoint;
	private float mediumPoint;
	public Student() {
	}

	public Student(int id, String fullName, float theoreticalPoint, float practicePoint) {
		this.id = id;
		this.fullName = fullName;
		this.practicePoint = theoreticalPoint;
		this.theoreticalPoint = practicePoint;
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

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public void setMediumPoint(float mediumPoint) {
		this.mediumPoint = mediumPoint;
	}
	
	public float getMediumPoint() {
		return mediumPoint;
	}

	public Student mediumScore() {
		this.setMediumPoint((this.theoreticalPoint+this.practicePoint)/2);
		return this;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", theoreticalPoint=" + theoreticalPoint
				+ ", practicePoint=" + practicePoint + "]";
	}
	
	
}

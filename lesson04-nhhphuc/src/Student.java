
public class Student {
	int id;
	String name;
	float theoreticalMark, practicalMark;
	
	public Student() {
	}
	
	public Student(int id, String name, float theoreticalMark, float practicalMark) {
		this.id = id;
		this.name = name;
		this.theoreticalMark = theoreticalMark;
		this.practicalMark = practicalMark;
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

	public float getTheoreticalMark() {
		return theoreticalMark;
	}

	public void setTheoreticalMark(float theoreticalMark) {
		this.theoreticalMark = theoreticalMark;
	}

	public float getPracticalMark() {
		return practicalMark;
	}

	public void setPracticalMark(float practicalMark) {
		this.practicalMark = practicalMark;
	}
	
	public float averageMark() {
		return (this.theoreticalMark + this.practicalMark)/2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoreticalMark=" + theoreticalMark + ", practicalMark="
				+ practicalMark + "]";
	}
	
	
}

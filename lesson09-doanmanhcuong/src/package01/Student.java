package package01;

public class Student {
	private int id;
	private String name;
	private Enum point;

	public Student() {

	}

	public Student(int id, String name, Enum c) {
		this.id = id;
		this.name = name;
		this.point = c;
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

	public Enum getPoint() {
		return point;
	}

	public void setPoint(Enum point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + "]";
	}

}

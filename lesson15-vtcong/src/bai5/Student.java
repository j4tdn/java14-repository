package bai5;

public class Student {
	private String id;
	private String name;
	private Double score;
	private String sex;
	
	public Student() {
	}

	public Student(String line) {
		String[] element = line.split(",");
		if(element.length == 4) {
			this.id = element[0];
			this.name = element[1];
			this.score = Double.parseDouble(element[2]);
			this.sex = element[3];
		}
	}
	
	public Student(String id, String name, Double score, String sex) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", sex=" + sex + "]";
	}
	
}

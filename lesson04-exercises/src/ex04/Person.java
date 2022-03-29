package ex04;

public class Person implements Salary {
	private String fullName;
	private String birthDay;
	private float costSalary;
	private int salary;

	public Person() {
	}

	public Person(String fullName, String birthDay, float costSalary) {
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.costSalary = costSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public float getCostSalary() {
		return costSalary;
	}

	public void setCostSalary(float costSalary) {
		this.costSalary = costSalary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "fullName=" + fullName + ", birthDay=" + birthDay + ", costSalary=" + costSalary + ",";
	}

	@Override
	public void calculationSalary() {
	}

}
package ex04;

public class Employee {
	private String name;
	private String birthday;
	private float salaryCoefficient;
	private Department department;

	public Employee() {
	}

	public Employee(String name, String birthday, float salaryCoefficient,
			Department department) {
		this.name = name;
		this.birthday = birthday;
		this.salaryCoefficient = salaryCoefficient;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public float getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(float salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee: " + name + " ,Birthday: " + birthday + " ,Salary coefficient: " + salaryCoefficient
				+ " ,Department: " + department + ".";
	}

}

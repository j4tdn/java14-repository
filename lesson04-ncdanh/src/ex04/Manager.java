package ex04;

public class Manager {
	private String name;
	private String birthday;
	private float salaryCoefficient;
	private int subordinateEmplsNumber;
	
	public Manager() {
	}

	public Manager(String name, String birthday, float salaryCoefficient, int subordinateEmplsNumber) {
		this.name = name;
		this.birthday = birthday;
		this.salaryCoefficient = salaryCoefficient;
		this.subordinateEmplsNumber = subordinateEmplsNumber;
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

	public int getSubordinateEmplsNumber() {
		return subordinateEmplsNumber;
	}

	public void setSubordinateEmplsNumber(int subordinateEmplsNumber) {
		this.subordinateEmplsNumber = subordinateEmplsNumber;
	}
	
	@Override
	public String toString() {
		return "Manager: "+name+" ,Birthday: "+birthday+" ,Salary coefficient: "+salaryCoefficient+
				" ,Number of surbodinate employees: "+subordinateEmplsNumber;
	}
}

package ex04;

public class Employee extends Person {
	protected String unitName;

	public Employee(String name, int yearOfBirth, float coefficientsSalary, String unitName) {
		super(name, yearOfBirth, coefficientsSalary);
		this.unitName = unitName;
	}

	public String getunitName() {
		return unitName;
	}

	public void setunitName(String unitName) {
		this.unitName = unitName;
	}
	
	@Override
	public float getSalary() {
		return coefficientsSalary*300000;
	}

	@Override
	public String toString() {
		return "Employee [unitName=" + unitName + ", name=" + name + ", yearOfBirth=" + yearOfBirth + ", coefficientsSalary="
				+ coefficientsSalary + "]";
	}
	
	
}
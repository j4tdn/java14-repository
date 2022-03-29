package ex04;

public class Employee extends Person {

	private String nameDepartment;

	public Employee(String fullName, String birthDay, float costSalary, String nameDepartment) {
		super(fullName, birthDay, costSalary);
		this.nameDepartment = nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	@Override
	public void calculationSalary() {
		this.setSalary((int) this.getCostSalary() * 1250000);
	}

	@Override
	public String toString() {
		return "Employee [" + super.toString() + "nameDepartment=" + nameDepartment + "]";
	}

}
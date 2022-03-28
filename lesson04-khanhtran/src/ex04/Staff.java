package ex04;

public class Staff extends Personel {
    private String department;

	public Staff() {
		super();
	}

	public Staff(String name, String birthDay, float coefficientSalary, String department) {
		super(name, birthDay, coefficientSalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString() +  " Staff [department=" + department + "]";
	}

	@Override
	public float getSalary() {
		return coefficientSalary * 1250000;
	}
}

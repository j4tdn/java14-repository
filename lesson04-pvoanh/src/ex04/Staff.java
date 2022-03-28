package ex04;



public class Staff extends Person {
	private String name;
	private String birthdate;
	private double hsl;
	private String nameOfDepartment;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(String name, String birthdate, double hsl, String nameOfDepartment) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.hsl = hsl;
		this.nameOfDepartment = nameOfDepartment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public double getHsl() {
		return hsl;
	}
	public void setHsl(double hsl) {
		this.hsl = hsl;
	}
	public String getNameOfDepartment() {
		return nameOfDepartment;
	}
	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.hsl*3000000;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", birthdate=" + birthdate + ", hsl=" + hsl + ", nameOfDepartment="
				+ nameOfDepartment + "salary=" +calculateSalary()+"]";
	}
	
}

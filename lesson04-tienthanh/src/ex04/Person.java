package ex04;

public abstract class Person {
	protected String name;
	protected int yearOfBirth;
	protected float coefficientsSalary;

	public abstract float getSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public float getcoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setcoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public Person(String name, int yearOfBirth, float coefficientsSalary) {

		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getThongTinLuong() {
	 return	String.format("%-25s %-20f",name , getSalary()); 
	}
}
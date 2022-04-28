package ex04;

public class Boss extends Person{
	private int serviceNumber;

	public Boss(String name, int yearOfBirth, float coefficientsSalary, int serviceNumber) {
		super(name, yearOfBirth, coefficientsSalary);
		this.serviceNumber = serviceNumber;
	}

	public int getserviceNumber() {
		return serviceNumber;
	}

	public void setserviceNumber(int serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	
	
	@Override
	public String toString() {
		return "Boss [serviceNumber=" + serviceNumber + ", name=" + name + ", yearOfBirth=" + yearOfBirth + ", coefficientsSalary="
				+ coefficientsSalary + "]";
	}

	@Override
	public float getSalary() {
		return (coefficientsSalary+serviceNumber)*300000;
	}
}
package package04;

public class Manager {
	private String name;
	private String dateOfBirth;
	private double coefficientsSalary;
	private int numberOfManagementStaff;

	public Manager() {

	}

	public Manager(String name, String dateOfBirth, double coefficientsSalary, int numberOfManagementStaff) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public int getNumberOfManagementStaff() {
		return numberOfManagementStaff;
	}

	public void setNumberOfManagementStaff(int numberOfManagementStaff) {
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	@Override
	public String toString() {
		return "Leader [name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary=" + coefficientsSalary
				+ ", numberOfManagementStaff=" + numberOfManagementStaff + "]";
	}

}

package package04;

public class Staff {
	private String name;
	private String dateOfBirth;
	private double coefficientsSalary;
	private String unitName;

	public Staff() {

	}

	public Staff(String name, String dateOfBirth, double coefficientsSalary, String unitName) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
		this.unitName = unitName;
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

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary=" + coefficientsSalary
				+ ", unitName=" + unitName + "]";
	}

}

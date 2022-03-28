package package04;

public class Leader {
	private String name;
	private String dateOfBirth;
	private double coefficientsSalary;
	private double positionCoefficient;

	public Leader() {

	}

	public Leader(String name, String dateOfBirth, double coefficientsSalary, double positionCoefficient) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
		this.positionCoefficient = positionCoefficient;
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

	public double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary=" + coefficientsSalary
				+ ", positionCoefficient=" + positionCoefficient + "]";
	}

}

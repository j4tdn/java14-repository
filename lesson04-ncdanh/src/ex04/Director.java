package ex04;

public class Director {
	private String name;
	private String birthday;
	private float salaryCoefficient;
	private float positionCoefficient;
	
	public Director() {
	}

	public Director(String name, String birthday, float salaryCoefficient, float positionCoefficient) {
		this.name = name;
		this.birthday = birthday;
		this.salaryCoefficient = salaryCoefficient;
		this.positionCoefficient = positionCoefficient;
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

	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	
	@Override
	public String toString() {
		return "Manager: "+name+" ,Birthday: "+birthday+" , Slary coefficient: "+salaryCoefficient+
				" , Position coefficient: "+positionCoefficient+".";
	}
	
	
}

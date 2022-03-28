package ex04;

public abstract class Personel {
    protected String name;
    protected String birthDay;
    protected float coefficientSalary;
    
    public Personel() {
	}

	public Personel(String name, String birthDay, float coefficientSalary) {
		this.name = name;
		this.birthDay = birthDay;
		this.coefficientSalary = coefficientSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public float getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(float coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}
	public abstract float getSalary();

	@Override
	public String toString() {
		return "Personel [name=" + name + ", birthDay=" + birthDay + ", coefficientSalary=" + coefficientSalary + "]";
	}
	
    
}

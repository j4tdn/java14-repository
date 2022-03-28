package ex04;

public class Manager extends Personel {
	private float positionCoefficient;

	public Manager() {
		super();
	}

	public Manager(String name, String birthDay, float coefficientSalary, float positionCoefficient) {
		super(name, birthDay, coefficientSalary);
		this.positionCoefficient = positionCoefficient;
	}

	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + positionCoefficient;
	}

	@Override
	public float getSalary() {
		return (coefficientSalary + positionCoefficient) * 3000000;
	}
}

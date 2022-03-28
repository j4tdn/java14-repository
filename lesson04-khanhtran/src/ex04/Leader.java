package ex04;

public class Leader extends Personel {
    private int quantityStaff;

	public Leader() {
		super();
	}

	public Leader(String name, String birthDay, float coefficientSalary, int quantityStaff) {
		super(name, birthDay, coefficientSalary);
		this.quantityStaff = quantityStaff;
	}

	public int getQuantityStaff() {
		return quantityStaff;
	}

	public void setQuantityStaff(int quantityStaff) {
		this.quantityStaff = quantityStaff;
	}

	@Override
	public String toString() {
		return super.toString() + " Leader [quantityStaff=" + quantityStaff + "]";
	}

	@Override
	public float getSalary() {
		return coefficientSalary*2200000;
	}
}

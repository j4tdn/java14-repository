package ex04;

public class Manager extends Person{
	private int numberEmployee;
	
	
	public Manager(String name, int yearOfBirth, float coefficientsSalary, int numberEmployee) {
		super(name, yearOfBirth, coefficientsSalary);
		this.numberEmployee = numberEmployee;
	}
	public int getnumberEmployee() {
		return numberEmployee;
	}
	public void setnumberEmployee(int numberEmployee) {
		this.numberEmployee = numberEmployee;
	}
	

	@Override
	public float getSalary() {
		return coefficientsSalary*300000;
	}

	@Override
	public String toString() {
		return "Manager [numberEmployee=" + numberEmployee + ", name=" + name + ", yearOfBirth=" + yearOfBirth
				+ ", coefficientsSalary=" + coefficientsSalary + "]";
	}
}
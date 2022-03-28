package Ex04;

public class Manager {
	private String name;
	private String date;
	private int numSalary;
	private int numStaff;

	public Manager() {
	}

	public Manager(String name, String date, int numSalary, int numStaff) {
		this.name = name;
		this.date = date;
		this.numSalary = numSalary;
		this.numStaff = numStaff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumSalary() {
		return numSalary;
	}

	public void setNumSalary(int numSalary) {
		this.numSalary = numSalary;
	}

	public int getNumStaff() {
		return numStaff;
	}

	public void setNumStaff(int numStaff) {
		this.numStaff = numStaff;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", date=" + date + ", numSalary=" + numSalary + ", numStaff=" + numStaff + "]";
	}

}

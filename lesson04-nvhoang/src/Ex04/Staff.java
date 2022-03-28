package Ex04;

public class Staff {
	private String name;
	private String date;
	private int numSalary;
	private String nameDepartment;
	public Staff() {
	}
	public Staff(String name, String date, int numSalary, String nameDepartment) {
		this.name = name;
		this.date = date;
		this.numSalary = numSalary;
		this.nameDepartment = nameDepartment;
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
	public String getnameDepartment() {
		return nameDepartment;
	}
	public void setNumDuty(String numDuty) {
		this.nameDepartment = nameDepartment;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", date=" + date + ", numSalary=" + numSalary + ", nameDepartment=" + nameDepartment + "]";
	}
	
}

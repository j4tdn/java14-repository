package Ex04;

public class President {
	private String name;
	private String date;
	private int numSalary;
	private int numDuty;

	public President() {
	}

	public President(String name, String date, int numSalary, int numDuty) {
		this.name = name;
		this.date = date;
		this.numSalary = numSalary;
		this.numDuty = numDuty;
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

	public int getNumDuty() {
		return numDuty;
	}

	public void setNumDuty(int numDuty) {
		this.numDuty = numDuty;
	}

	@Override
	public String toString() {
		return "President [name=" + name + ", date=" + date + ", numSalary=" + numSalary + ", numDuty=" + numDuty + "]";
	}

}

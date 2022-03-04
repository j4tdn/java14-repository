package bean;

public class Customer {
	private String name;
	private boolean gender;
	
	public Customer() {
	}

	public Customer(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + "]";
	}
	
	
}

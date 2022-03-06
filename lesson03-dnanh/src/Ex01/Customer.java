package Ex01;

public class Customer {
	private String name;
	private String phone;
	private String address;
	private boolean gender;

	public Customer() {
	}

	public Customer(String name, String phone, String address, boolean gender) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", address=" + address + ", gender=" + gender + "]";
	}
	
}

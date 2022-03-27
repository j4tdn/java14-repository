package package05;

public class Customer {
	private int idcustomer;
	private String fullname;
	private String phoneNumber;
	private String address;

	public Customer() {
	}

	public Customer(int idcustomer, String fullname, String phoneNumber, String address) {
		this.idcustomer = idcustomer;
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getIdcustomer() {
		return idcustomer;
	}

	public void setIdcustomer(int idcustomer) {
		this.idcustomer = idcustomer;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [idcustomer=" + idcustomer + ", fullname=" + fullname + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}
	
	
	
}

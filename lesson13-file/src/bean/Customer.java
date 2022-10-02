package bean;

import file.content.AbstractFile;

public class Customer implements AbstractFile {
	private String fullname;
	private String phone;
	private String address;

	public Customer(String line) {
		String[] elements = line.split(", ");
		if(elements.length == 3) {
			this.fullname = elements[0];
			this.phone = elements[1];
			this.address = elements[2];
		}
		
	}

	public Customer(String fullname, String phone, String address) {
		this.fullname = fullname;
		this.phone = phone;
		this.address = address;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	@Override
	public String toString() {
		return "Customer [fullname=" + fullname + ", phone=" + phone + ", address=" + address + "]";
	}

	public String toLine() {
		return String.join(", ", getFullname(), getPhone(), getAddress() + "\n");
	}
}

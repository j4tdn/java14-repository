
public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	private User() {

	}

	// Construct builder
	// User.builder().firstName("").age(12).build();
	public static Builder builder() {
		return new Builder();
	}
	private User(Builder builder) {
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.age=builder.age;
		this.phone=builder.phone;
		this.address=builder.address;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public static class Builder {
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;

		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder setlastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		// new Builder().lastName("last").firstName("first").build()
		public User build() {
			return new User(this);
		}

	}
}

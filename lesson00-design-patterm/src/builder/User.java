package builder;

/**
 * Không thể sử dụng constructor để khởi tạo đối tượng phức tạp dùng Builder
 */
public class User {
	private String firsName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
// Ngăn không tự khởi tạo đối tượng 
	private User() {

	}
	private User(Builder builder) {
		this.firsName = builder.firsName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	// Construct builder
	// User.builder().firstName("").age(12).build();
	public static Builder builder() {
		return new Builder();
	}
	
	// getter
	public String getFirsName() {
		return firsName;
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
	//toString
	@Override
	public String toString() {
		return "Builder [firsName=" + firsName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	
	}
	//inner class
	public static class Builder{
		
		
		
		private String firsName;
		private String lastName;
		private int age;
		private String phone;
		private String address;
		
		private Builder() {
			
		}
		// user --> builder(Khởi tạo giá trị)--> user
		// new Builder().lastName().firstName()
		//Initial attribute's value
	public Builder firstName(String firstName) {
		this.firsName = firstName;
		return this;
	}	
	public Builder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public Builder age(int age) {
		this.age = age;
		return this;
	}
	public Builder phone(String phone) {
		this.phone = phone;
		return this;
	}
	public Builder address(String address) {
		this.address = address;
		return this;
	}
	public User build() {
		return new User(this);
	}
	}
}

package builder;

public class BuilderDemo {
	public static void main(String[] args) {
		User user = User.builder()
			.age(20)
			.firstName("Jone")
			.lastName("Doe")
			.build();
		
		System.out.println(user);
		
		// String ----> StringBuilder
		Warehouse warehouse = new Warehouse().manager("Cambridge")
				.minItems(10)
				.maxItems(20);
		System.out.println(warehouse);
	}
}

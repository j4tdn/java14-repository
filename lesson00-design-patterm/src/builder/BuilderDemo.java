package builder;

public class BuilderDemo {
public static void main(String[] args) {
	User user = User.builder()
			.age(20)
			.firstName("JOe")
			.lastName("DOe")
			.build();
	System.out.println(user);
	Warehouse warehouse = new Warehouse().manager("Hoang").maxItems(10).minItems(20);
	System.out.println(warehouse);
	
}
}

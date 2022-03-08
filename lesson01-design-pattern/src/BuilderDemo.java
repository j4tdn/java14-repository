

public class BuilderDemo {
	public static void main(String[] args) {
		User user= User.builder().setFirstName("Oanh").setlastName("Pham").build();
		System.out.println(user);
		
		System.out.println("=================================");
		
		WareHouse wareHouse= new WareHouse().manager("Phạm Văn Oanh");
		System.out.println(wareHouse);
	}
}

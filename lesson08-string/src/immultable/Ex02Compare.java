package immultable;

public class Ex02Compare {
	public static void main(String[] args) {
		System.out.println("A".equals("B"));
		System.out.println("Ab".equals("aB"));
		System.out.println("abc".equals("z"));
		
		System.out.println("\n================");
		System.out.println("A".compareTo("B"));
		System.out.println("Ab".compareTo("Ab"));
		System.out.println("zbc".compareTo("z"));
	}
}

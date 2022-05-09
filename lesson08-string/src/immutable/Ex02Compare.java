package immutable;

public class Ex02Compare {
	public static void main(String[] args) {
		System.out.println("A".equals("B"));
		System.out.println("Ab".equals("Ab"));
		System.out.println("abc".equals("z"));
		System.out.println("==================");
		System.out.println("A".compareTo("B"));
		System.out.println("Ab".compareTo("Ab"));
		System.out.println("abc".compareTo("z"));
	}
}

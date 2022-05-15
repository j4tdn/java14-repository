package immutable;

public class Ex05Split {
	public static void main(String[] args) {
		String s = "Le Na, 034 898 2910, Nu, English";
		
		String[] elements = s.split(",\\s");

		for(String element : elements) {
			System.out.println(element);
		}
	}
}

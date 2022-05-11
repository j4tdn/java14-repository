package immutable;

public class Ex05Split {
	public static void main(String[] args) {
		//String s = "xin chao cac ban";
		String s = "Le Na, 035 898 2910, Nu, English";

		
		//String[] elements = s.split("\\s", 2);
		String[] elements = s.split(",\\s");

		
		for(String element: elements) {
			System.out.println(element);
		}
	}
}

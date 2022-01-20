package iteration;

public class Ex {
    public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
		
		String[] elements = {"aa", "bbbb", "ccc", "d"};
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
		
		for (String element: elements) {
			System.out.println(element);
		}
	}
}

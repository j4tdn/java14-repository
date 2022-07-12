package generic;

public class Ex01GenericMethodArray {
	public static void main(String[] args) {
		Integer[] orders = {1,2,3,4,5};
		Double[] points = {7.8d, 5.6d, 9.8d, 8.8d};
		String[] codes = {"IT01", "SP02", "KT15"};
		
		// printf(orders);
		// printf(points);
		printf(codes);
		
		print(orders);
		print(points);
		print(codes);
	}
	
	// Object + ... <--> Generic
	// --> Runtime
	// --> No restriction
	
	// Generic Type
	// Any name --> convention single letter E, T, R,
	// --> compile
	// --> Restrict type as expected
	
	// Element extends CharSequence --> Element: CharSequence || sub class of CharSequence
	private static <Element extends CharSequence> void printf(Element[] elements) {
		for(Element element: elements) {
			System.out.println(element+ " ");
		}
		System.out.println();
	}
	
	private static void print(Object[] elements) {
		for(Object element: elements) {
			System.out.println(element+ " ");
		}
		System.out.println();
	}
	
}

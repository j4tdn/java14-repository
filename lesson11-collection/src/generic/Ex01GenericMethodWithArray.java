package generic;

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Integer[] orders = { 1, 2, 3, 4, 5 };
		Double[] points = { 7.8d, 5.6d, 9.8d, 8.8d };
		String[] codes = { "IT01", "SP02", "KT15" };
		printf(orders);
		printf(orders);
	}
	
	// Object <---->			Generic
	//->runtime					-> compile
	//->No Restriction			-> restriction: han che
	
	
	// <T extends Number> restrict Object, CharSequence 
	public static <T extends Number> void printf(T[] elements) {
		for(T  e : elements) {
			System.out.print(e + " ");
		}
	}
	public static  void printfo(Object[] elements) {
		for(Object  e : elements) {
			System.out.print(e + " ");
		}
	}
}

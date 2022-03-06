package structure;

public class Ex08 {
	public static void main(String[] args) {
		CustomInteger ci1 = new CustomInteger(12);
		CustomInteger ci2 = new CustomInteger(36);
		swap(ci1,ci2);
		System.out.println("ci1 = " + ci1 + " ci2 = " + ci2);
		       
	}
	// trick
		// private static int swap(int a, int b) {
		// 	return a;
		// }
		
		private static void swap(CustomInteger first, CustomInteger second) {
			// swap heap
			int tmp = first.value;
			first.value = second.value;
			second.value = tmp;
		}
	// swap(a, b) >> void
		// sort(list) >> void
		
		// = STACK
		// int x = a;
		// int y = b;
		private static void swapP(int x, int y) {
			// swap x, y
			int tmp = x;
			x = y;
			y = tmp;
		}
	// Integer x = c
		// Integer y = d
		private static void swapO(Integer x, Integer y) {
			Integer tmp = x;
			x = y;
			y = tmp;
		}

}

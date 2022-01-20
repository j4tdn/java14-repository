package structure;

public class Ex08 {

	public static void main(String[] args) {
		// Primitive Type
		int a = 5;
		int b = 10;
		swapP(a, b);
		System.out.println("a: " + a); // 5
		System.out.println("b: " + b); // 10

		// Object Type
		Integer c = 5;
		Integer d = 10;
		swapO(c, d);
		System.out.println("c: " + c);
		System.out.println("d: " + d);

		System.out.println("========================");
		CustomInteger ci1 = new CustomInteger(12);
		CustomInteger ci2 = new CustomInteger(36);

		swap(ci1, ci2);
		System.out.println("ci1: " + ci1);
		System.out.println("ci2: " + ci2);

		System.out.println("======================");
		int m = 7;
		int n = 9;
		n = swap(m, m = n);
		System.out.println("m: " + m);
		System.out.println("n: " + n);

		System.out.println("============================");

		int a1 = 10;
		//Integer b1 = 12;
		Integer b1 = null;
		//a1 = b1;
		b1 = a1;
		
		System.out.println("a1: "+a1);
		System.out.println("b1: "+b1);
		
		//NullPoiterException
		//custom do not point to any object in HEAP
		CustomInteger custom = null;
		custom.value = 200;
		System.out.println("custom: "+custom);
		
	}

	// just for fun
	// trick!!!!
	private static int swap(int a, int b) {
		return a;
	}

	private static void swap(CustomInteger first, CustomInteger second) {
		// swap head
		int tmp = first.value;
		first.value = second.value;
		second.value = tmp;

	}

	private static void swapP(int x, int y) {
		// swap x, y
		int tmp = x;
		x = y;
		y = tmp;
	}

	private static void swapO(Integer x, Integer y) {
		Integer tmp = x;
		x = y;
		y = tmp;
	}

}

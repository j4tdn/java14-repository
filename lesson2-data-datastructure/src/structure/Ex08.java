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
				System.out.println("c: " + c); // 5
				System.out.println("d: " + d); // 10
				System.out.println("======================");
				CustomInteger ci1 = new CustomInteger(12);
				CustomInteger ci2 = new CustomInteger(36);
				
				swap(ci1, ci2);
				
				System.out.println("ci1: " + ci1); //  12
				System.out.println("c21: " + ci2); //  36
				
				System.out.println("===================");
				int m = 7;
				int n = 9;
				n = swap(m, m=n);
				System.out.println("m: " + m);
				System.out.println("n: " + n);
				
				
				//int(value), Integer(null,value)
				// Before <JDK 1.5 << Unable
				
				// Form >=JDK 1.5 >> auto boxing
				
				 int a1 = 10;
				 Integer b1 = 5;
				 a1=b1; // 
				 b1=a1; //
				 
				 
				 // NullPointerException 
				 CustomInteger custom = null;
				 custom.value = 20;
				 System.out.println("custom"+ custom);
	} 
	// trick
		private static int swap(int a, int b) {
			return a;
		}
		
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

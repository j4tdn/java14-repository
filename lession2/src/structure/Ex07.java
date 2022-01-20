package structure;
public class Ex07 {
	public static void main(String[] args) {
		//primitive type
		int a = 5;
		int b = 10;
		swapP(a,b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		// Object Type
		Integer c = 5;
		Integer d = 10;
		swapO(c, d);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		System.out.println("==================");
		CustomInteger ci1 = new CustomInteger(12);
		CustomInteger ci2 = new CustomInteger(36);
		swap(ci1, ci2);
		System.out.println("ci1 : " + ci1);
		System.out.println("ci2 : " + ci2);
		//trick
		int m = 5;
		int n = 10;
		n = swap(m, m=n);
		System.out.println("m : " + m);
		System.out.println("n : " + n);
		System.out.println("====================");
		//int , Integer
		//float , Float 
		//double , Double
		//Before < JDK 1.5
		//From >= JDK 1.5
		
		int a1= 10;
		Integer b1 = 5;
		a1=b1;
		b1=a1;
		
		System.out.println("a1 : " + a1);
		System.out.println("b1 : " + b1);
	}
	
	// trick
	private static int swap(int a, int b) {
		return a;
	}
	
	
	private static void swap(CustomInteger first , CustomInteger second) {
		int tmp = first.value;
		first.value = second.value;
		second.value = tmp;
	}
	
	// = Stack
	// int x = a;
	// int y = b;
	private static void swapP(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
	private static void swapO(Integer x, Integer y) {
		int tmp =x;
		x=y;
		y=tmp;
	}
}

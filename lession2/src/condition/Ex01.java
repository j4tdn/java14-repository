package condition;

public class Ex01 {
	public static void main(String[] args) {
		int first =8,second=18,c=15;
		Pair pair = getMinMax(first, second, c);
		
		System.out.println("max : " + pair.max);
		System.out.println("min : " + pair.min);
	}
	
	// viet ham tim min max của 3 số
	private static Pair getMinMax(int a, int b,int c) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		/// thuật toán
		return new Pair(min,max);
		
	}
}

package ex03;

public class Ex03 {
	public static void main(String[] args) {
		int []A = {2,3};
		int []B = {2,3,4};
		System.out.println("least common multiple A :" + getLeastCommonMultiple(A));
		System.out.println("least common multiple B :" + getLeastCommonMultiple(B));
	}
	public static int getLeastCommonMultiple(int[] array) {
		//least common multiple=lcm
		int lcm = 1;
		for(int i=0;i<array.length;i++) {
			lcm=LCM(lcm,array[i]);
		}
		return lcm;
	}
	private static int GCM(int a, int b) {
		if(b==0) {
			return a;
		}
		return GCM(b,a%b);
	}
	private static int LCM(int a, int b) {
		return (a*b)/GCM(a,b);
	}
}

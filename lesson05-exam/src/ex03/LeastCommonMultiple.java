package ex03;

public class LeastCommonMultiple {
	
	public static int greatestCommonDivisor(int a, int b) {
		while(a != b) {
			if(a > b) {
				a -= b;
			} else {
				b -=a;
			}
		}
		return a;
	}
	public static int leastCommonMultiple(int a, int b) {
		return (a * b) / greatestCommonDivisor(a, b);
	}
	public static int getLeastCommonMultiple(int[] arr) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			temp = leastCommonMultiple(arr[i], temp);
		}
		return temp;
	}
    public static void main(String[] args) {
    	int[] arr = {2,3,4,8,9};
		int test = getLeastCommonMultiple(arr);
		System.out.println(test);
	}
}

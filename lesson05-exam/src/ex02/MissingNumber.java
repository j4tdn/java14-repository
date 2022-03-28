package ex02;

public class MissingNumber {
	
	public static int getMissingNumber(int[] arr, int n) {
		int sumArr = 0;
		int sumN = n + (n-1);
		for(int i=0; i<arr.length; i++) {
			sumArr += arr[i];
			sumN += i;
		}
		return sumN - sumArr;
	}
    public static void main(String[] args) {
		int[] test = {1,2,3,4,5};
		System.out.println(getMissingNumber(test,6));
	}
}

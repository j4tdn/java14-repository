package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int arr[]= {3, 7, 9, 2, 1, 6, 5, 4, 10};
		int n = getMissingNumber(arr);
		System.out.println("MissNumber: "+n);
	}
	public static int getMissingNumber(int[] array) {
		int sumArray =0;
		int n=(array.length+1);
		for(int i:array) {
			sumArray=sumArray+i;
		}
		return (n*(n+1)/2)-sumArray;
	}
}

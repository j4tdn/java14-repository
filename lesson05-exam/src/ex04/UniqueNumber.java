package ex04;

import java.util.Arrays;

public class UniqueNumber {
	public static int[] sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	public static int[] getUniqueNumber(int[] arr) {
		int[] temp = new int[arr.length];
		boolean[] check = new boolean[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(check[i]==true) continue;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					check[i] = true;
					check[j] = true;
				}
			}
		}
		int run=0;
		for(int i=0; i<check.length; i++) {
			if(!check[i]) {
				temp[run++] = arr[i];
			}
		}
		temp = Arrays.copyOfRange(temp, 0, run);
		return sort(temp);
	}
    public static void main(String[] args) {
		int[] a = {1,2,2,5,6,8,7,2,3};
		int[] test = getUniqueNumber(a);
		for(int x:test) {
			System.out.print(x);
		}
	}
}

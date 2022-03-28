package package04;

import java.util.Arrays;

public class App04 {
	public static void main(String[] args) {
		int [] numbers= {3, 15, 21, 0, 15, 17, 21};
		int[]rs=uniqueNumber(numbers);
		sort(rs);
		System.out.println(Arrays.toString(rs));
	}
	public static int[] uniqueNumber(int []arr) {
		int []rs= new int[arr.length];
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(!isExist(arr, arr[i])) {
				rs[c++]=arr[i];
			}
		}
		
		return Arrays.copyOfRange(rs,0,c);
	}
	public static void sort (int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static boolean isExist(int []arr,int a) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				return true;
			}
		}
		return false;
	}
}
